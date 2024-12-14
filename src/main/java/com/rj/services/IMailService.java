package com.rj.services;

import com.rj.binding.CustomerBean;
import com.rj.binding.OwnerBean;

public interface IMailService {
    public void sendMail(OwnerBean ob);
    public void sendMail(CustomerBean cb);
    public void sendMail(Integer id);
}
