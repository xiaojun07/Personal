package com.Personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Personal.dao.PersonalInfoDao;
import com.Personal.domain.PersonalInfo;

@Controller
@RequestMapping(value="/demo")
public class DemoController {

	@Autowired
	private PersonalInfoDao personalInfoDao;
	
	@ResponseBody
	@RequestMapping(value="/get")
	public String demo(){
		PersonalInfo personalInfo =new PersonalInfo();
		personalInfo.setPhone("13800138000");
		personalInfoDao.find(personalInfo);
		return "success";
	}
}
