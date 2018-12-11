package com.test.restspringcxfwebservice.test;

import com.test.restspringcxfwebservice.TestRestCxfWebService;
import com.test.restspringcxfwebservice.TestUser;
import com.test.springcxfwebservice.TestCxfWebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetRestService {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("cxf-servlet-client.xml");
        TestRestCxfWebService service = (TestRestCxfWebService) context.getBean("cxfService");
        TestUser testUser =service.testRestMethod(12);
        System.out.println("this client test :"+testUser.getPassword());
    }
}
