package com.eg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("mybeans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		XyzEMail bean = (XyzEMail)factory.getBean("mail");
		bean.sendMail();
		bean.recvMail();
	}
}
