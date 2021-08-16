package com.demo.ehcache.config;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.springframework.context.annotation.Bean;

/**
 * @author mao2080@sina.com
 */
public class CacheConfiguration {

    @Bean
    public Cache dataSource() {
        CacheManager manager = CacheManager.create("./src/main/resources/ehcache.xml");
        return manager.getCache("mycache");
    }

}
