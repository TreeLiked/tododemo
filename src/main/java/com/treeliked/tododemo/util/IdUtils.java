package com.treeliked.tododemo.util;

import java.util.UUID;

/**
 * uuid 工具类
 *
 * @author lqs2
 * @date 2018-12-23, Sun
 */
public class IdUtils {


    /**
     * 获取32位随机id
     */
    public static String get32Id() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取24位随机id
     */
    public static String get24Id() {
        return get32Id().substring(0, 24);
    }

    /**
     * 获取16位随机id
     */
    public static String get16Id() {
        return get32Id().substring(0, 16);
    }

    /**
     * 获取8位随机id
     */
    public static String get8Id() {
        return get32Id().substring(0, 8);
    }

    /**
     * 获取4位随机id
     */
    public static String get4Id() {
        return get32Id().substring(0, 4);
    }
}
