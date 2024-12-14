package com.rj.controller;

import com.rj.binding.CustomerBean;
import com.rj.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @GetMapping("/CustomerRegistration")
    public String customerRegistration(Model model){
        CustomerBean cb = new CustomerBean();
        model.addAttribute("cbind", cb);
        return "CustomerRegistrationPage";
    }

    @PostMapping("/addCustomer")
    public String registerCustomer(CustomerBean customerBean, Model model){
        customerBean.setDate(Date.from(Instant.now()));
        String msg = customerService.addCustomer(customerBean);
        model.addAttribute("message", msg);
        return "WelcomeOwner";
    }

    @GetMapping("/Customers")
    public String getCustomers(Model model){
        List<CustomerBean> list = customerService.getAllCustomers();
        for(CustomerBean cb : list){
            System.out.println(cb);
        }
        model.addAttribute("customers", list);
        return "CustomerDetails";
    }
}
