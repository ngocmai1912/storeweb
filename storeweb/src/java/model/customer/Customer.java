/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hoaha
 */
public class Customer implements Serializable{
    private int id;
    private String phone;
    private String mail;
    private String active;
    private String type;
    private Date dateOfBirth;
    private Account account;
    private FullName fullName;
    private List<Address> listAddress;

    public Customer(int id, String phone, String mail, String active, String type, Date dateOfBirth, Account account, FullName fullName, List<Address> listAddress) {
        this.id = id;
        this.phone = phone;
        this.mail = mail;
        this.active = active;
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.account = account;
        this.fullName = fullName;
        this.listAddress = listAddress;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public List<Address> getListAddress() {
        return listAddress;
    }

    public void setListAddress(List<Address> listAddress) {
        this.listAddress = listAddress;
    }
    
    
}
