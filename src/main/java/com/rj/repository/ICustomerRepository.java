package com.rj.repository;

import com.rj.binding.CustomerBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<CustomerBean, Integer> {

    @Query("SELECT c.mail FROM CustomerBean c WHERE c.id = :id")
    String findMailById(@Param("id") Integer id);
}
