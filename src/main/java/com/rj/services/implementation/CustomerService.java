package com.rj.services.implementation;

import com.rj.binding.CustomerBean;
import com.rj.repository.ICustomerRepository;
import com.rj.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;
    @Autowired
    MailService mailService;

    @Override
    public String addCustomer(CustomerBean cb) {
        String msg = "";
        try {
            CustomerBean cb1 = customerRepository.save(cb);
            if (cb1.getId()!=null) {
                msg = "Customer registration Success";
                mailService.sendMail(cb);
            }
            else
                msg = "Failed to Register Customer!";
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return msg;
    }

    @Override
    public List<CustomerBean> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public String getCustomer(Integer id) {
        return customerRepository.findMailById(id);
    }

}
