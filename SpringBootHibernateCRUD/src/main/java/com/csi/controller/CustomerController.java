package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {


    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<String> savaData(@RequestBody Customer customer){
        customerServiceImpl.savaData(customer);
        return ResponseEntity.ok("Customer Data Save Succesfully");
    }

    @GetMapping("/getdatabyid/{custId}")
    public ResponseEntity<Customer> getDataById(@PathVariable int custId){

        return ResponseEntity.ok(customerServiceImpl.getDataById(custId));
    }
@GetMapping("/getalldata")
    public ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(customerServiceImpl.getAllData());
}
@PutMapping("/updatedata/{custId}")
    public ResponseEntity<String> updateData(@PathVariable int custId, @RequestBody Customer customer ){
    customerServiceImpl.updateData(custId,customer);
    return ResponseEntity.ok("Custmer Data Updated Succesfully");
}

@DeleteMapping("/deletedatabyid/{custId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int custId){

    customerServiceImpl.deleteDataById(custId);
    return ResponseEntity.ok("Data Deleted Succesfully");
}
@GetMapping("/hey")
    public String sayHello(){
        return "Welcome Everybody";
}
}
