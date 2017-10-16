package com.cangqing;

//Reference:http://blog.csdn.net/forezp/article/details/69934399

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by song on 2017/10/12.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    //断路器支持
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://register-service-hi/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
