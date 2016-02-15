package com.wuzy.dubbo.service;

import org.dubbo.provider.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserService {
	
	@Autowired
	private DubboDemoService demoService;
	
	public String t(){
		demoService.test();
		return "haha!!!";
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring/spring-context.xml" });
		System.out.println("111");
		context.start();
        System.out.println("222");
		DubboDemoService demoService = (DubboDemoService) context.getBean("demoService");
		System.out.println("3333");
		String ret = demoService.test();
		System.out.println("ret==="+ret);
	}
	

}
