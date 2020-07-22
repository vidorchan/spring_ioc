package com.vidor;

import com.alibaba.druid.pool.DruidDataSource;
import com.vidor.config.DruidConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.vidor", excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes = {Service.class}),
        @ComponentScan.Filter(type=FilterType.CUSTOM, classes = {MyExcludeFilter.class})
})
@Import(DruidConfig.class)
public class JavaConfig {
    public JavaConfig(){
        System.out.println("容器加载，就调用了构造方法");
    }
}