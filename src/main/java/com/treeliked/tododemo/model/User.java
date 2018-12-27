package com.treeliked.tododemo.model;

/**
 * 用户私密信息
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
public class User extends LoginUser {

    /**
     * 用户密码
     */
    private String pwd;

    /**
     * 上一次的密码
     */
    private String lastPwd;

    /**
     * 密码长度
     */
    private String pwdLen;

    /**
     * 盐值
     */
    private String slat;

    /**
     * 加密方式
     */
    private String encrypt;


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLastPwd() {
        return lastPwd;
    }

    public void setLastPwd(String lastPwd) {
        this.lastPwd = lastPwd;
    }

    public String getPwdLen() {
        return pwdLen;
    }

    public void setPwdLen(String pwdLen) {
        this.pwdLen = pwdLen;
    }

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }


    @Override
    public String toString() {
        return "User{" +
                "pwd='" + pwd + '\'' +
                ", lastPwd='" + lastPwd + '\'' +
                ", pwdLen='" + pwdLen + '\'' +
                ", slat='" + slat + '\'' +
                ", encrypt='" + encrypt + '\'' +
                "} " + super.toString();
    }
}
