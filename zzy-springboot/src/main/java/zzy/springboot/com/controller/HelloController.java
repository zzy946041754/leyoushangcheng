package zzy.springboot.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @GetMapping("show1")
    public String test(){
        return "hello zzy 1";
    }


}
