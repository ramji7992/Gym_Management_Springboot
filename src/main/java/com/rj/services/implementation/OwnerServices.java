package com.rj.services.implementation;

import com.rj.binding.OwnerBean;
import com.rj.repository.IOwnerRepository;
import com.rj.services.IOwnerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class OwnerServices implements IOwnerServices {
    @Autowired
    IOwnerRepository ownerRepository;
    @Autowired
    MailService mailService;

    @Override
    public String registerOwner(OwnerBean ob) {
        String msg="";
        try {
            OwnerBean data = ownerRepository.save(ob);

            if (data.getId() != null){
                msg = "Record Saved Successfully";
                mailService.sendMail(ob);
            } else {
                msg = "Failed to save Record";
            }
        } catch (DataIntegrityViolationException e) {
            e.printStackTrace();
            msg = "Unable to Register! Username Already Exist. Please try Another Username";
        } catch (Exception e) {
            e.printStackTrace();
            msg = "Failed to Register";
        }
        return msg;
    }
    @Override
    public OwnerBean getUserByUsernameAndPassword(String username, String password) {
        OwnerBean ob = null;
        try {
            ob = ownerRepository.findByUserNameAndPassword(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ob;
    }
}

