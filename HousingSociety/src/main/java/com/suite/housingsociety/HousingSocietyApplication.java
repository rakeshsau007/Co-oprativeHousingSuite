package com.suite.housingsociety;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.suite.housingsociety")
@EnableJpaRepositories
@EnableTransactionManagement
public class HousingSocietyApplication extends SpringBootServletInitializer {

   public static void main(String[] args) {
       SpringApplicationBuilder app = new SpringApplicationBuilder(HousingSocietyApplication.class);
       app.run();
       //.lazyInitialization(true)
       //.build(args)
       
   }

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
       return application.sources(HousingSocietyApplication.class);
   }
}
