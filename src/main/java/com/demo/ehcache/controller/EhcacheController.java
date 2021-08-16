package com.demo.ehcache.controller;

import com.demo.ehcache.beans.ResObj;
import com.demo.ehcache.service.EhcacheService;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mao2080@sina.com
 */
@RestController
@RequestMapping("/ehcachetroller")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    private static final String CACHE_NAME = "ehcache-demo";

    @Autowired
    private EhcacheService ehcacheService;

    /**
     * 存缓存
     * @param key
     * @param val
     * @return
     */
    @RequestMapping("/setCache")
    @ResponseBody
    public ResObj setCache(@RequestParam("key") String key, @RequestParam("val") String val) {
        LOGGER.info("key={}, val={}", key, val);
        this.ehcacheService.setCache(CACHE_NAME, key, val);
        return new ResObj();
    }

    /**
     * 取缓存
     * @param key
     * @return
     */
    @RequestMapping("/getCache")
    @ResponseBody
    public ResObj getCache(@RequestParam("key") String key) {
        LOGGER.info("get key={}", key);
        String val = this.ehcacheService.getCache(CACHE_NAME, key);
        return new ResObj(val);
    }

    /**
     * 删缓存
     * @param key
     * @return
     */
    @RequestMapping("/delCache")
    @ResponseBody
    public ResObj delCache(@RequestParam("key") String key) {
        LOGGER.info("del key={}", key);
        this.ehcacheService.delCache(CACHE_NAME, key);
        return new ResObj();
    }

    /**
     * 清空指定name的所有缓存
     * @return
     */
    @RequestMapping("/clearCache")
    @ResponseBody
    public ResObj clearCache() {
        LOGGER.info("clear");
        this.ehcacheService.clearCache(CACHE_NAME);
        return new ResObj();
    }

}
