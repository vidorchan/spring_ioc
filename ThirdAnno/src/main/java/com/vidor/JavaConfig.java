package com.vidor;

import com.alibaba.druid.pool.DruidDataSource;
import com.vidor.config.DruidConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.vidor")
@Import(DruidConfig.class)
public class JavaConfig {
}