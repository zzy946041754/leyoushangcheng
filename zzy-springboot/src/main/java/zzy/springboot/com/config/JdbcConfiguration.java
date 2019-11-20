package zzy.springboot.com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration //声明一个类为java配置类，相当于一个xml文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
@EnableConfigurationProperties(JdbcProperties.class)  //启用属性读取类
public class JdbcConfiguration {
    //属性注入
    //@Autowired
   // private JdbcProperties jdbcProperties;
    /*//构造函数注入
    public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties=jdbcProperties;
    }*/
    @Bean //把方法的返回值注入到Spring容器中
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource( ){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
   /* public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
      return dataSource;
    }*/
}
