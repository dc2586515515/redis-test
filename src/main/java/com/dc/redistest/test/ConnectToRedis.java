package com.dc.redistest.test;

import redis.clients.jedis.Jedis;

/**
 * @Description
 * @Author DC
 * @Date 2020-03-23
 */
public class ConnectToRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
    }
}
