package controllers;

import config.SimpleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SimpleConfig simpleConfig;

    @GetMapping("/")
    public String hello() {
        return "hello1.html";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2.html";
    }

    @GetMapping("/hello.do")
    public String helloDo() {
        return "hello3.html";
    }

    @GetMapping("/print")
    public String print() {
        System.out.println(String.format("simple config ==> host:%s, port:%s ", simpleConfig.getHost(), simpleConfig.getPort()));
        return String.format("simple config ==> host:%s, port:%s ", simpleConfig.getHost(), simpleConfig.getPort());
    }
}
