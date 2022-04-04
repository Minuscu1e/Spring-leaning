package com.minuscu1e;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.tests.sample.beans.TestBean;

import static org.junit.Assert.*;
public class BeanTests {

	@org.junit.Test
	public void test1(){
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/BeanFactoryUtilsTests-root.xml"));
		TestBean test = (TestBean) bf.getBean("test");
		System.out.println(test.getAge());
	}
}
