package com.fix.spring.entity.impl;

import com.fix.spring.entity.InkBox;

public class BlackInkBox  implements InkBox {

	@Override
	public String showColor() {
		return "黑白的";
	}

}