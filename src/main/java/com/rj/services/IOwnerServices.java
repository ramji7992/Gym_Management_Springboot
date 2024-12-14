package com.rj.services;

import com.rj.binding.OwnerBean;

public interface IOwnerServices {
    public String registerOwner(OwnerBean ob);
    public OwnerBean getUserByUsernameAndPassword(String username, String password);
}
