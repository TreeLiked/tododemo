package com.treeliked.tododemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis 缓存工具类
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
@Component
public class RedisStorageUtils {

    private final StringRedisTemplate stringRedisTemplate;

    private final RedisTemplate redisTemplate;

    @Autowired
    public RedisStorageUtils(StringRedisTemplate stringRedisTemplate, RedisTemplate redisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisTemplate = redisTemplate;
    }



}
