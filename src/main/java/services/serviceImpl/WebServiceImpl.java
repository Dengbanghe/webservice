package services.serviceImpl;

import services.WebService;

@javax.jws.WebService(endpointInterface = "services.WebService")
public class WebServiceImpl implements WebService {

    public String helloWorld(String name) {
        return "hello "+name;
    }
}
