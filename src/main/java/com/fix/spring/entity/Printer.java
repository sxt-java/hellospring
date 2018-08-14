package com.fix.spring.entity;

/**
 * 打印机
 *
 */
public class Printer {

	private InkBox inkBox;
	private Paper paper;

	//只要set方法就行
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void print() {
		System.out.println("在"+paper.showSize()+"纸上开始打印"+inkBox.showColor());
		 
	}

}
