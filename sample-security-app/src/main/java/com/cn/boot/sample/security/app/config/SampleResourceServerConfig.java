package com.cn.boot.sample.security.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author Chen Nan
 */
@Configuration
@EnableResourceServer
public class SampleResourceServerConfig extends ResourceServerConfigurerAdapter {

}
