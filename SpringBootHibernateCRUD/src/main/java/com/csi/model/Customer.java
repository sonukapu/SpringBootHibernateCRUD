package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="customer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name="cust_id")
    private int custId;

    @Column(name="cust_name")
    private String custName;

    @Column(name="cust_contact")
    private long custContactNumber;

    @Column(name="cust_acc_bal")
    private double custAccountBalance;

    @Column(name="cust_dob")
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date custDOB;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(long custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    public double getCustAccountBalance() {
        return custAccountBalance;
    }

    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }
}
