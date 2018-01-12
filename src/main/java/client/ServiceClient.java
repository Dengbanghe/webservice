package client;

import services.WebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ServiceClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(WebService.class);
        factory.setAddress("http://localhost:8989/webservice/helloWorld");
        WebService service = (WebService)factory.create();
        String s = service.helloWorld("sb");
        System.out.println(s);
    }
}
