package com.tradecards.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.tradecards.service.LoginService;


@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	LoginService loginService;
	
	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
		//auth.userDetailsService(loginService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/webjars/**",
                 "/photos/**",
                "/assets/**",
                "index**",
                "**",
                "international**",
                "error**",
                "/img/**",
                "/lib/**",
                "/resources/**",
                "/public/**",
                "/dist/**",
                "/db/**",
                "/prototype/**",
                "/test/**"
        );
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests().
                antMatchers(
                "/index**",
                "/dist/**",
                "/webjars**",
                "/rememberPassword**", 
                "/db/**")
                .permitAll().anyRequest().
                 authenticated().and().logout().
                 logoutSuccessUrl("/").permitAll().and().csrf()
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and().formLogin()
                .loginPage("/home").permitAll().and().logout().deleteCookies("remember-me")
                .logoutSuccessUrl("/login?logout").permitAll().and().rememberMe();
        http.csrf().disable();

    }
    
}
