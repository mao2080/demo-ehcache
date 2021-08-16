package com.demo.ehcache.service;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mao2080@sina.com
 */
@Service
public class EhcacheService {

    @Resource
    private CacheManager cacheManager;

    /**
     * 存缓存
     * @param key
     * @param val
     * @return
     */
    public void setCache(String cacheName, String key, String val) {
        this.cacheManager.getCache(cacheName).put(key, val);
    }

    /**
     * 取缓存
     * @param key
     * @return
     */
    public String getCache(String cacheName, String key) {
        return this.cacheManager.getCache(cacheName).get(key, String.class);
    }

    /**
     * 删缓存
     * @param key
     * @return
     */
    public void delCache(String cacheName, String key) {
        this.cacheManager.getCache(cacheName).evict(key);
    }

    /**
     * 清空指定name的所有缓存
     * @return
     */
    public void clearCache(String cacheName) {
        this.cacheManager.getCache(cacheName).clear();
    }

}
