package com.neoteric.aop1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.neoteric.aop1")
@EnableAspectJAutoProxy
public class AppConfig {

}
