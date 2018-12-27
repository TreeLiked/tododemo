package com.treeliked.tododemo.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 密码工具类
 *
 * @author lqs2
 * @date 2018-12-26, Wed
 */
public class PwdUtils {


    /**
     * 使用md5方式加密密码
     *
     * @param pwd  密码
     * @param salt 盐值
     * @return 加密后的字符串
     */
    public static String encryptPwdWithMd5(String pwd, String salt) {
        return DigestUtils.md5Hex(pwd + salt);
    }

    /**
     * 使用md5方式加密密码
     *
     * @param pwd  密码
     * @param salt 盐值
     * @return 加密后的字符串
     */
    public static String encryptPwdWithSha1(String pwd, String salt) {
        return DigestUtils.sha1Hex(pwd + salt);
    }

}
