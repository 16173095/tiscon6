package com.tiscon.domain;

import java.io.Serializable;

public class Customer implements Serializable {

    private String movingMonth;

    private Integer customerId;

    private String oldPrefectureId;

    private String newPrefectureId;

    private String oldZip;

    private String newZip;

    private String customerName;

    private String tel;

    private String email;

    private String oldAddress;

    private String newAddress;

    public String getMovingMonth() {
        return movingMonth;
    }

    public void setMovingMonth(String movingMonth) {
        this.movingMonth = movingMonth;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getOldZip() {
        return oldZip;
    }

    public void setOldZip(String oldZip) {
        this.oldZip = oldZip;
    }

    public String getNewZip() {
        return newZip;
    }

    public void setNewZip(String newZip) {
        this.newZip = newZip;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }
}
