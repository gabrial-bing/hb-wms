package com.hb.upms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author zhaojiahui
* @version 创建时间：2019年5月8日 下午4:30:34
* @ClassName 类名称
* @Description 类描述
*/

@Controller
public class CommonController {
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// 作为一个空方法，可以匹配任何无效输入，再跳转到404
		return formName;
//		String blank = "blank";
//		return blank;
	}
	
	@RequestMapping(value="/")
	 public String index(){
		String blank = "index";
		return blank;
	}
	@RequestMapping(value="/welcome")
	 public String welcome(){
		String blank = "welcome";
		return blank;
	}
}
