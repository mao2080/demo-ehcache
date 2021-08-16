package com.demo.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author mao2080
 */
@SpringBootApplication(scanBasePackages = {"com.demo"})
@EnableCaching
public class EhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhcacheApplication.class, args);
        System.out.println("http://localhost:8080/ehcachetroller/setCache?key=test&val=helloWorld");
        System.out.println("http://localhost:8080/ehcachetroller/getCache?key=test");
        System.out.println("http://localhost:8080/ehcachetroller/delCache?key=test");
        System.out.println("http://localhost:8080/ehcachetroller/clearCache");
    }

}
