package com.hb.upms.controller;

import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hb.upms.common.PageTable;
import com.hb.upms.common.RestResult;
import com.hb.upms.constant.ResultCode;
import com.hb.upms.controller.dto.HrmUserDTO;
import com.hb.upms.model.HrmUserDO;
import com.hb.upms.model.HrmUserDOExample;
import com.hb.upms.service.HrmUserDOService;
import com.hb.upms.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/users")
public class HrmUserController {

	@Autowired
	private HrmUserDOService hrmUserDOService;

	private ObjectMapper jsonMapper = new ObjectMapper();


	@GetMapping(value="/myupdate")
	public String update(Model model,
						 HttpSession session) {
		HrmUserDO hrmUserDO = (HrmUserDO) session.getAttribute(Constants.USER_SESSION);
		model.addAttribute("user", hrmUserDO);
		return "/user/myupdate";
	}

	@PostMapping(value="/myupdate")
	@ResponseBody
	 public RestResult update(ModelAndView mv,
							  HttpSession session,
							  @ModelAttribute HrmUserDO hrmUserDO) {
		hrmUserDOService.updateByPrimaryKeySelective(hrmUserDO);
		session.setAttribute(Constants.USER_SESSION, hrmUserDO);
		return RestResult.success();
	}


	@GetMapping(value = "/page/list")
	public String list(Model model,
					   HrmUserDTO hrmUserDTO) {
		// 权限管理页面
		return "user/list";
	}

	@GetMapping(value = "/list")
	@ResponseBody
	public RestResult list(
			Integer pageNum,
			Integer pageSize,
			HrmUserDTO hrmUserDTO) {
		if (pageNum == null || pageSize == null) {
			pageNum = 1;
			pageSize = 5;
		}
		// 在application.yml里配置了分页参数合理化，所以不需要处理start的检查
		PageTable pageTable = hrmUserDOService.selectByExamplewithPage(
				pageNum,
				pageSize,
				buildPageExample(hrmUserDTO));

		if (pageTable != null) {
			return RestResult.success(pageTable);
		} else {
			return RestResult.failed(ResultCode.PAGE_LIST_ERROR);
		}

	}

	private HrmUserDOExample buildPageExample(HrmUserDTO hrmUserDTO) {
		if (hrmUserDTO == null) {
			return null;
		}

		String username = hrmUserDTO.getUsername();

		HrmUserDOExample example = new HrmUserDOExample();
		HrmUserDOExample.Criteria criteria = example.createCriteria();

		// 权限名称
		if (StringUtils.isNotBlank(username)) {
			criteria.andUsernameLike("%" + username + "%");
		}

		// 默认按id升序排
		example.setOrderByClause("id asc");
		return example;
	}

	@GetMapping(value = "/page/roleAuth")
	public String roleAuth(Model model,
					   Integer id) throws JsonProcessingException {
		HrmUserDO hrmUserDO = hrmUserDOService.selectByPrimaryKey(id);
		model.addAttribute("user", jsonMapper.writeValueAsString(hrmUserDO));
		// 给用户授予角色的页面
		return "user/roleAuth";
	}


}
