package publicserver;

import services.serviceImpl.WebServiceImpl;

import javax.xml.ws.Endpoint;

public class PublicService {
    public static void main(String[] args) {
        String url="http://localhost:8989/webservice/helloWorld";
        Endpoint.publish(url,new WebServiceImpl());
        System.out.println("public successful!");
    }
}
