package org.example.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.logging.Logger;

/**
 * Created by Daniel on 2014-12-10.
 */
@Configuration
@EnableWebSecurity
public class SecurityManager extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().
                withUser("danne").password("test").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        Logger.getLogger("C").info("Security");

        System.out.println("Api security");
        http
                .antMatcher("/data/**")
                .authorizeRequests()
                .anyRequest().hasRole("USER")
                .and()
                .httpBasic();
    }
}
