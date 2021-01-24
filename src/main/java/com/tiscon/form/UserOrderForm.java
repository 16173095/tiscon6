package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message="{UserOrderForm.movingMonth.message}")
    @Max(12)
    @Min(1)
    private String movingMonth;

    @NotBlank(message="{UserOrderForm.customerName.message}")
    private String customerName;

    @NotBlank(message="{UserOrderForm.tel.message}")
    @Numeric
    private String tel;

    @Email
    @NotBlank(message="{UserOrderForm.email.message}")
    private String email;

    @NotBlank(message="{UserOrderForm.oldZip.message}")
    @Pattern(regexp = "^[0-9]{7}$")
    private String oldZip;

    @NotBlank(message="{UserOrderForm.oldPrefectureId.message}")
    private String oldPrefectureId;

    @NotBlank(message="{UserOrderForm.oldAddress.message}")
    private String oldAddress;

    @NotBlank(message="{UserOrderForm.newZip.message}")
    @Pattern(regexp = "^[0-9]{7}$")
    private String newZip;

    @NotBlank(message="{UserOrderForm.newPrefectureId.message}")
    private String newPrefectureId;

    @NotBlank(message="{UserOrderForm.newAddress.message}")
    private String newAddress;

    @Numeric
    @NotBlank(message="{UserOrderForm.box.message}")
    private String box = "0";

    @Numeric
    @NotBlank(message="{UserOrderForm.bed.message}")
    private String bed = "0";

    @Numeric
    @NotBlank(message="{UserOrderForm.bicycle.message}")
    private String bicycle = "0";

    @Numeric
    @NotBlank(message="{UserOrderForm.washingMachine.message}")
    private String washingMachine = "0";

    @NotNull
    private boolean washingMachineInstallation;

    public String getMovingMonth() {
        return movingMonth;
    }

    public void setMovingMonth(String movingMonth) {
        this.movingMonth = movingMonth;
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

    public String getOldZip() {
        return oldZip;
    }

    public void setOldZip(String oldZip) {
        this.oldZip = oldZip;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewZip() {
        return newZip;
    }

    public void setNewZip(String newZip) {
        this.newZip = newZip;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
}
