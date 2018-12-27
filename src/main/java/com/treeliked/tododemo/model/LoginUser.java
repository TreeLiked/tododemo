package com.treeliked.tododemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户公开信息
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
public class LoginUser implements Serializable {

    private static final long serialVersionUID = 6766874220410111084L;

    /**
     * 账户id
     */
    private String id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Boolean gender;

    /**
     * 生日
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birth;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 签名
     */
    private String slogan;

    /**
     * 注册时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date regTime;

    /**
     * 最后修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastModTime;

    /**
     * 账户状态，是否启用
     */
    private Boolean state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", avatar='" + avatar + '\'' +
                ", slogan='" + slogan + '\'' +
                ", regTime=" + regTime +
                ", lastModTime=" + lastModTime +
                ", state=" + state +
                '}';
    }
}
