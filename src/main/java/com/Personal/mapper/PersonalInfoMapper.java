package com.Personal.mapper;

import com.Personal.domain.PersonalInfo;
import com.Personal.vo.PersonalInfoVO;

public interface PersonalInfoMapper {

	public PersonalInfoVO find(PersonalInfo personalInfo);
}
