package com.eurekastudy.eureka;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Project : springCloud
 * @Package Name : com.eurekastudy.eureka
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 13:26
 * @Description :
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf().disable();
        super.configure(http);
    }
}