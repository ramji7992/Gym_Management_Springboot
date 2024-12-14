package com.rj.services;

import com.rj.binding.CustomerBean;

import java.util.List;
import java.util.Optional;

public interface ICustomerService  {
    public String addCustomer(CustomerBean cb);
    public List<CustomerBean> getAllCustomers();
    public String getCustomer(Integer id);

}
