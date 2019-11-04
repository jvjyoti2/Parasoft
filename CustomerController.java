package com.parasoft.paragon;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo cR;


    // ------------ Retrieve all customers ------------
    @RequestMapping(value = "/customers/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCustomers() {
        System.out.println(this.getClass().getSimpleName()+" - Get All Customer Service is Invoked.");
        return cR.findAll();
    }

    // ------------ Add a customer ------------
    @RequestMapping(value = "/customers/add", method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer) {
        System.out.println(this.getClass().getSimpleName()+" - Add new Customer Service is Invoked.");
        return cR.save(customer);
    }
    // ------------------ delete --------------
    @RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable int id) {
        System.out.println(this.getClass().getSimpleName()+" - Delete Customer by Id Service is Invoked.");
        cR.deleteById((long) id);
    }
}
