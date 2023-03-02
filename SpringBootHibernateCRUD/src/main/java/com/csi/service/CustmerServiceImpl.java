package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustmerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;




    @Override
    public void savaData(Customer customer) {

        customerDaoImpl.savaData(customer);

    }

    @Override
    public Customer getDataById(int custId) {
        return customerDaoImpl.getDataById(custId);
    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    @Override
    public void updateData(int custId, Customer customer) {

        customerDaoImpl.updateData(custId,customer);

    }

    @Override
    public void deleteDataById(int custId) {

        customerDaoImpl.deleteDataById(custId);

    }
}
