package com.xtang.pojo;

import java.util.Date;

public class UserInfo {
    private String id;

    private String userid;

    private String realname;

    private Date birth;

    private String phone;

    private String eamil;

    private String address;

    private Date createTime;

    private String desc;

    public UserInfo(String id, String userid, String realname, Date birth, String phone, String eamil, String address, Date createTime) {
        this.id = id;
        this.userid = userid;
        this.realname = realname;
        this.birth = birth;
        this.phone = phone;
        this.eamil = eamil;
        this.address = address;
        this.createTime = createTime;
    }

    public UserInfo(String id, String userid, String realname, Date birth, String phone, String eamil, String address, Date createTime, String desc) {
        this.id = id;
        this.userid = userid;
        this.realname = realname;
        this.birth = birth;
        this.phone = phone;
        this.eamil = eamil;
        this.address = address;
        this.createTime = createTime;
        this.desc = desc;
    }

    public UserInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil == null ? null : eamil.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}