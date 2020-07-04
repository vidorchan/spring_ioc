package com.vidor.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.vidor.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
public class DruidConfig {
    @Value("${mysql.username}")
    private String name;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.password}")
    private String password;

    @Value("${mysql.driver}")
    private String driver;

    /*
    第三方bean怎么依赖一个内部类，直接传参即可。不需要写Autowired
     */
    @Bean
    public DruidDataSource dataSource(User user){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setName(name);
        druidDataSource.setUrl(url);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driver);
        System.out.println(user.toString());//User{name='null'}
        return druidDataSource;
    }
}
