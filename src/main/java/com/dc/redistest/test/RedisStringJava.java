package com.dc.redistest.test;

import redis.clients.jedis.Jedis;

/**
 * @Description Redis Java String(字符串) 实例
 * @Author DC
 * @Date 2020-03-23
 */
public class RedisStringJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("name","redisTest");
        System.out.println("redis存贮字符串为："+ jedis.get("name"));
    }
}
