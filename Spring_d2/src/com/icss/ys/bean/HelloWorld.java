package com.icss.ys.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	@Value(value="点击按钮")
	private String button;

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
	
	
}
