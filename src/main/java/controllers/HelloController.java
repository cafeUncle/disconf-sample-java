package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String h() {
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
}
