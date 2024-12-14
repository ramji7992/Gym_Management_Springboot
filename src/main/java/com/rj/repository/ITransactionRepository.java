package com.rj.repository;

import com.rj.binding.TransactionBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<TransactionBean, Integer> {

    List<TransactionBean> findByRegistrationId(Integer id);
}
