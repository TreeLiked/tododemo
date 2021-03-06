package com.treeliked.tododemo.model.dataobject;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TodoUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.id
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.nickname
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.email
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.last_pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String lastPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.pwd_len
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String pwdLen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.slat
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String slat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.encrypt
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String encrypt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.gender
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.birth
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.avatar
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.slogan
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private String slogan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.reg_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date regTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.last_login_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastModTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo_user.state
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    private Boolean state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.id
     *
     * @return the value of todo_user.id
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.id
     *
     * @param id the value for todo_user.id
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.nickname
     *
     * @return the value of todo_user.nickname
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.nickname
     *
     * @param nickname the value for todo_user.nickname
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.email
     *
     * @return the value of todo_user.email
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.email
     *
     * @param email the value for todo_user.email
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.pwd
     *
     * @return the value of todo_user.pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.pwd
     *
     * @param pwd the value for todo_user.pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.last_pwd
     *
     * @return the value of todo_user.last_pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getLastPwd() {
        return lastPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.last_pwd
     *
     * @param lastPwd the value for todo_user.last_pwd
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setLastPwd(String lastPwd) {
        this.lastPwd = lastPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.pwd_len
     *
     * @return the value of todo_user.pwd_len
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getPwdLen() {
        return pwdLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.pwd_len
     *
     * @param pwdLen the value for todo_user.pwd_len
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setPwdLen(String pwdLen) {
        this.pwdLen = pwdLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.slat
     *
     * @return the value of todo_user.slat
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getSlat() {
        return slat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.slat
     *
     * @param slat the value for todo_user.slat
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setSlat(String slat) {
        this.slat = slat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.encrypt
     *
     * @return the value of todo_user.encrypt
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getEncrypt() {
        return encrypt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.encrypt
     *
     * @param encrypt the value for todo_user.encrypt
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.gender
     *
     * @return the value of todo_user.gender
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.gender
     *
     * @param gender the value for todo_user.gender
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.birth
     *
     * @return the value of todo_user.birth
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.birth
     *
     * @param birth the value for todo_user.birth
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.avatar
     *
     * @return the value of todo_user.avatar
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.avatar
     *
     * @param avatar the value for todo_user.avatar
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.slogan
     *
     * @return the value of todo_user.slogan
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.slogan
     *
     * @param slogan the value for todo_user.slogan
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.reg_time
     *
     * @return the value of todo_user.reg_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.reg_time
     *
     * @param regTime the value for todo_user.reg_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.last_login_time
     *
     * @return the value of todo_user.last_login_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public Date getLastModTime() {
        return lastModTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.last_login_time
     *
     * @param lastModTime the value for todo_user.last_login_time
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo_user.state
     *
     * @return the value of todo_user.state
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo_user.state
     *
     * @param state the value for todo_user.state
     *
     * @mbg.generated Tue Dec 25 10:39:07 CST 2018
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TodoUser{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", lastPwd='" + lastPwd + '\'' +
                ", pwdLen='" + pwdLen + '\'' +
                ", slat='" + slat + '\'' +
                ", encrypt='" + encrypt + '\'' +
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