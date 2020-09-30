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
    }

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

        http
                .authorizeRequests()
                .antMatchers("/member/**")
                .hasRole("MEMBER")
                .antMatchers("/admin/**"
                        , "/manage/delete-user/**")
                .hasRole("ADMIN")
                .antMatchers("/manage/delete-post/**")
                .hasAnyRole("MEMBER", "ADMIN")
                .and()
                .formLogin()
                .loginPage("/sign-in")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/sign-in")
                .defaultSuccessUrl("/")
                .failureUrl("/sign-in/loginFailed")
                .and()
                .exceptionHandling()
                .accessDeniedPage("/sign-in")
                .and()
                .logout()
                .logoutSuccessUrl("/sign-in/logout").permitAll()
                .and()
                .csrf()
                .disable()
                .headers().httpStrictTransportSecurity().disable();
    }
}