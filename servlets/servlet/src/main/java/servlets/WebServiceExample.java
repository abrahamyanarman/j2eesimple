package servlets;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebServiceExample {

    private final String message = "Hello, ";

    public WebServiceExample() {
    }

    @WebMethod(exclude = true)
    public String sayHello(String name) {
        return message + name + ".";
    }
}
