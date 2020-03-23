package com.dc.redistest.test;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @Description Redis Java List(列表) 实例
 * @Author DC
 * @Date 2020-03-23
 */
public class RedisListJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        // 存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
