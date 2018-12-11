
package com.test.restspringcxfwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test.restspringcxfwebservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestRestMethodResponse_QNAME = new QName("http://restspringcxfwebservice.test.com/", "testRestMethodResponse");
    private final static QName _TestUser_QNAME = new QName("http://restspringcxfwebservice.test.com/", "testUser");
    private final static QName _TestRestMethod_QNAME = new QName("http://restspringcxfwebservice.test.com/", "testRestMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test.restspringcxfwebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestRestMethodResponse }
     * 
     */
    public TestRestMethodResponse createTestRestMethodResponse() {
        return new TestRestMethodResponse();
    }

    /**
     * Create an instance of {@link TestUser }
     * 
     */
    public TestUser createTestUser() {
        return new TestUser();
    }

    /**
     * Create an instance of {@link TestRestMethod }
     * 
     */
    public TestRestMethod createTestRestMethod() {
        return new TestRestMethod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRestMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://restspringcxfwebservice.test.com/", name = "testRestMethodResponse")
    public JAXBElement<TestRestMethodResponse> createTestRestMethodResponse(TestRestMethodResponse value) {
        return new JAXBElement<TestRestMethodResponse>(_TestRestMethodResponse_QNAME, TestRestMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://restspringcxfwebservice.test.com/", name = "testUser")
    public JAXBElement<TestUser> createTestUser(TestUser value) {
        return new JAXBElement<TestUser>(_TestUser_QNAME, TestUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestRestMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://restspringcxfwebservice.test.com/", name = "testRestMethod")
    public JAXBElement<TestRestMethod> createTestRestMethod(TestRestMethod value) {
        return new JAXBElement<TestRestMethod>(_TestRestMethod_QNAME, TestRestMethod.class, null, value);
    }

}
