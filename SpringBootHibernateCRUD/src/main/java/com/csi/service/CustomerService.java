package com.csi.service;

import com.csi.model.Customer;

import java.util.List;

public interface CustomerService {


    public void savaData(Customer customer);

    public Customer getDataById(int custId);

    public List<Customer> getAllData();

    public void updateData(int custId, Customer customer);

    public void deleteDataById(int custId);
}
