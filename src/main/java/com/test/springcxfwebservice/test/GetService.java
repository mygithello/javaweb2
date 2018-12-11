package com.test.springcxfwebservice.test;

import com.test.springcxfwebservice.TestCxfWebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetService {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("cxf-servlet-client.xml");
        TestCxfWebService service = (TestCxfWebService) context.getBean("cxfService");
        String string =service.testMethod();
        System.out.println("this client test :"+string);
    }
}
