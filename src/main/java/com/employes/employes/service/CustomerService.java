package com.employes.employes.service;


import com.employes.employes.entity.Customer;
import com.employes.employes.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer idCustomer) {
        return customerRepository.findById(idCustomer).get();
    }

    @Override
    public Customer save(Customer customer) {
       return customerRepository.save(customer);
    }

    @Override
    public void delete(Integer idCustomer) {
        customerRepository.deleteById(idCustomer);
    }
}
