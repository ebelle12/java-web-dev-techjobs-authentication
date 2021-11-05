package org.launchcode.javawebdevtechjobsauthentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


    @Configuration
    public class WebApplicationConfig implements WebMvcConfigurer {

        // Create spring-managed object to allow the app to access our filter
        @Bean
        public org.launchcode.javawebdevtechjobsauthentication.AuthenticationFilter authenticationFilter() {
            return new org.launchcode.javawebdevtechjobsauthentication.AuthenticationFilter();
        }

        // Register the filter with the Spring container
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor( authenticationFilter() );
        }

    }

