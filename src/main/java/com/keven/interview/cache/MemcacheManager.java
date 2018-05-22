package com.keven.interview.cache;

import net.rubyeye.xmemcached.MemcachedClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keven
 * @date 2018-05-20 下午6:28
 * @Description
 *
 * memcached 的 使用，封装了常见的 操作
 */
@Service
public class MemcacheManager {

    @Resource
    private MemcachedClient client;



}
