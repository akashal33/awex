package com.awe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.awe.beans.Radio;

public class AutoWireTest {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/awe/common/application-context.xml"));
		Radio radio = beanFactory.getBean("radio",Radio.class);
		System.out.println(radio);
		
	}

}
