package com.chujie.framework.demo1.entity;

/**
 * @Name:UserEntity
 * @description: UserEntity
 * @author: chu jie
 * @create: 2020/01/22 14:55
 * @version:1.0
 * @update_record:
 */
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    @Override
    public String toString() {
        return "User{" +
                "id:" +this.id+","+
                "userName:"+ this.userName + "," +
                "password:"+ this.passWord + "," +
                "realName" + this.realName +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}