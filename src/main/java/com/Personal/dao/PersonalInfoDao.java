package com.Personal.dao;

import com.Personal.domain.PersonalInfo;
import com.Personal.vo.PersonalInfoVO;

public interface PersonalInfoDao {

	public PersonalInfoVO find(PersonalInfo personalInfo);
}
