package com.employes.employes.service;



import com.employes.employes.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public Customer findById(Integer idCustomer);
    public Customer save(Customer customer);
    public void delete(Integer idCustomer);
}
