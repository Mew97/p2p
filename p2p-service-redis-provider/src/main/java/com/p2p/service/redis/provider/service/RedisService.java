package com.p2p.service.redis.provider.service;

public interface RedisService {

    public void set(String key, Object value, long seconds);
    public Object get(String key);

}
