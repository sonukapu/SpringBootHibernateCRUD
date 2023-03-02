package com.csi.dao;

import com.csi.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

   private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();




    @Override
    public void savaData(Customer customer) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();

    }

    @Override
    public Customer getDataById(int custId) {
        Session session = factory.openSession();

        Customer customer = (Customer) session.get(Customer.class,custId);


        return customer;
    }

    @Override
    public List<Customer> getAllData() {

        Session session = factory.openSession();



        return session.createQuery("from Customer").list();
    }

    @Override
    public void updateData(int custId, Customer customer) {
Session session = factory.openSession();
Transaction transaction=session.beginTransaction();

Customer customer1 = getDataById(custId);

customer1.setCustName(customer.getCustName());
customer1.setCustContactNumber(customer.getCustContactNumber());
customer1.setCustAccountBalance(customer.getCustAccountBalance());
customer1.setCustDOB(customer.getCustDOB());

session.update(customer1);

transaction.commit();


    }

    @Override
    public void deleteDataById(int custId) {

        Session session = factory.openSession();

        Transaction transaction =session.beginTransaction();

Customer customer= getDataById(custId);
transaction.commit();

    }
}
