package com.dc.redistest.test;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-23
 */
public class RedisKeyJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");

        // 获取数据并取出
        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
