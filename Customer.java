package com.parasoft.paragon;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

// Model class
@Entity
@Table(name="customer")
public class Customer {

    @Id
    private long id;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_phone")
    private Long userPhone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getPhone() {
        return userPhone;
    }

    public void setPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }
}