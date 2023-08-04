package com.ab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		DummyEmail dobj = new DummyEmail();
		dobj.recvMail();
		dobj.sendMail();
        
        /*//We are providing the values 10 and "abcd" dynamically
        //Employee s=(Employee)factory.getBean("e",38,"testingpurpose");  
        Employee s=(Employee)factory.getBean("e",32,"jhsdfgj"); 
        s.setMarks(25);
        s.show();
        */
        
	}
}
