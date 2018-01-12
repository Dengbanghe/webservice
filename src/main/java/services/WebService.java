package services;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {
    @WebMethod
    String helloWorld(String name);
}
