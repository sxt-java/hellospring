package com.fix.spring.entity.impl;

import com.fix.spring.entity.Paper;

public class A4Paper implements Paper{

	@Override
	public String showSize() {
		 
		return "长400mm,宽300mm";
	}

}
