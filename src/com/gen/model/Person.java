package com.gen.model;

import java.util.Date;

public class Person {
    private Long id;

    private String username;

    private String address;

    private String phone;

    private String remark;

    private Date created;

    private Integer flgdeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getFlgdeleted() {
        return flgdeleted;
    }

    public void setFlgdeleted(Integer flgdeleted) {
        this.flgdeleted = flgdeleted;
    }
}