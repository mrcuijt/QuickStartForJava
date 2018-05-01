package com.wayneleo.quickstart.framework.core.conf;

import javax.servlet.MultipartConfigElement;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@EnableScheduling
@EntityScan( Application.FRAMEWORK_BASE_PACKAGE )
@EnableJpaRepositories( Application.FRAMEWORK_BASE_PACKAGE )
@ComponentScan( Application.FRAMEWORK_BASE_PACKAGE )
public class Application {
    public static final String FRAMEWORK_BASE_PACKAGE = "com.wayneleo.quickstart";

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize( "5Mb" );
        factory.setMaxRequestSize( "10Mb" );
        return factory.createMultipartConfig();
    }
}
