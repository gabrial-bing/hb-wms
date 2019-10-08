package com.hb.upms.controller;

import com.hb.upms.model.HrmUserDO;
import com.hb.upms.service.HrmUserDOService;
import com.hb.upms.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    private HrmUserDOService hrmUserDOService;


    /**
     *
     * @param username
     * @param password
     * @param session
     * @param mv
     * @return
     */
    @RequestMapping(value="/login")
    public ModelAndView login(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              HttpSession session,
                              ModelAndView mv) {

        HrmUserDO hrmUserDO = hrmUserDOService.login(username, password);
        if (hrmUserDO == null) {
            // 设置登录失败提示信息
            mv.addObject("message", "登录名或密码错误!请重新输入");
            // 服务器内部跳转到登录页面
            mv.setViewName("forward:/loginForm");
            return mv;
        }

        // 将用户保存到HttpSession当中
        session.setAttribute(Constants.USER_SESSION, hrmUserDO);
        // 客户端跳转到main页面
        mv.setViewName("redirect:/index");
        return mv;
    }

    @RequestMapping(value="/logout")
    public ModelAndView logout(ModelAndView mv, HttpSession session){
        session.removeAttribute(Constants.USER_SESSION);
        session.setAttribute("tip", null);
        mv.setViewName("redirect:/index");

        return mv;
    }

}
