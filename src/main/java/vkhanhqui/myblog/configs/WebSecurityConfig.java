package vkhanhqui.myblog.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    };

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }

    protected void configure(HttpSecurity http) throws Exception {

    	http.authorizeRequests()
		.antMatchers("/customer/**").hasAnyRole("ADMIN", "USER")			
		.antMatchers("/vkhanhqui_myblog_war/**", "/resource/**").permitAll()
		.and().formLogin().loginPage("/sign-in")
		.usernameParameter("username").passwordParameter("password")
		.loginProcessingUrl("/sign-in").permitAll()			
		.failureUrl("/sign-in/loginFailed").and().logout().logoutUrl("/sign-in/doLogout")
		.logoutSuccessUrl("/sign-in/logout").permitAll()
		.and().csrf().disable();

    }
}