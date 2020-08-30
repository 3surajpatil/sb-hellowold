package org.ssp.executor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ssp.beans.BeanClass;

public class AppExecutor {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");

	BeanClass bc=(BeanClass)ac.getBean("beanclass");
	
	bc.testBean();
	}

}
