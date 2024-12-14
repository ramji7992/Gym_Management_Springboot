package com.rj.repository;

import com.rj.binding.OwnerBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends JpaRepository<OwnerBean, Integer> {

    public OwnerBean findByUserNameAndPassword (String username, String password);

}
