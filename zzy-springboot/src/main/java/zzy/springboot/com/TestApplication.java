package zzy.springboot.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@EnableAutoConfiguration //启用springboot自动配置
@ComponentScan   //类似于<context:component-scan base-package="">  扫描该类所在包下的所有类*/
@SpringBootApplication //组合注解，相当于@EnableAutoConfiguration+@ComponentScan+@SpringBootConfiguration
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}
