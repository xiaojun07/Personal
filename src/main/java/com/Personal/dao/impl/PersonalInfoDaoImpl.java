package com.Personal.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.Personal.dao.PersonalInfoDao;
import com.Personal.domain.PersonalInfo;
import com.Personal.mapper.PersonalInfoMapper;
import com.Personal.vo.PersonalInfoVO;

public class PersonalInfoDaoImpl implements PersonalInfoDao {

	@Autowired
	private PersonalInfoMapper personalInfoMapper;
	
	@Override
	public PersonalInfoVO find(PersonalInfo personalInfo) {
		return personalInfoMapper.find(personalInfo);
	}

}
