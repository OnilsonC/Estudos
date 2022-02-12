package com.estudoscx.spring.cx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ServletComponentScan
@EnableJpaRepositories("com.estudoscx.spring.cx.dao")
@SpringBootApplication(scanBasePackages = "com.estudoscx.spring.cx.*")
@EntityScan("com.estudoscx.spring.cx.models")
public class CxApplication {
    
            
	public static void main(String[] args) {
            
		SpringApplication.run(CxApplication.class, args);
	}

}
