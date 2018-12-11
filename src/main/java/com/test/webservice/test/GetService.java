package com.test.webservice.test;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.test.webservice.impl.TestServiceImpl;
import com.test.webservice.impl.TestServiceImplService;

public class GetService {
    public static void main(String[] args) {

        TestServiceImpl service =new TestServiceImplService().getTestServiceImplPort();
        System.out.println("this is client !!");
        service.login();

    }

}
