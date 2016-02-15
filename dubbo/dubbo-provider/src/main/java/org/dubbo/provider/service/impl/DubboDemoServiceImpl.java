package org.dubbo.provider.service.impl;

import org.dubbo.provider.service.DubboDemoService;

public class DubboDemoServiceImpl implements DubboDemoService {

	public String test() {
		System.out.println("我被调用了！！！!!!");
		return "fuck you man!!";
	}

}
