package com.tutorial.esempio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReportClient {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportGenerator rg1 = (ReportGenerator) context.getBean("reportGenerator",ReportGenerator.class);
		rg1.reportGen("CIAO");
	}
}
