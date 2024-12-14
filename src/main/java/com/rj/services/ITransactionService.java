package com.rj.services;

import com.rj.binding.TransactionBean;

import java.util.List;
import java.util.Optional;

public interface ITransactionService {
    public String addTxn(TransactionBean tb);
    public List<TransactionBean> viewTxns();
    public List<TransactionBean> viewById(Integer id);
}
