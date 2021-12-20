package exam.backend.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(HttpSecurity http) throws Exception {

    http.authorizeRequests().antMatchers("/xxx/**").authenticated();
    http.authorizeRequests().anyRequest().permitAll();
    http.csrf().disable();

  }
}
