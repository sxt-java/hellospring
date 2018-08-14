package com.fix.spring.entity.impl;

import com.fix.spring.entity.Paper;

public class B5Paper implements Paper{

	@Override
	public String showSize() {
		return "长300mm,宽200mm";
	}

}
