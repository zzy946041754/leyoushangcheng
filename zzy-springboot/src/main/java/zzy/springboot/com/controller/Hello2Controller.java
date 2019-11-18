package zzy.springboot.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Hello2Controller {
    @GetMapping("show2")
    public String test(){
        return "hello zzy 2";
    }


}
