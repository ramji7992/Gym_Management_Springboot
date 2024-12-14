package com.rj.services.implementation;

import com.rj.binding.TransactionBean;
import com.rj.repository.ITransactionRepository;
import com.rj.services.IMailService;
import com.rj.services.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TransactionService implements ITransactionService {
    @Autowired
    ITransactionRepository transactionRepository;
    @Autowired
    IMailService mailService;

    @Override
    public String addTxn(TransactionBean tb) {
        TransactionBean tb1 = transactionRepository.save(tb);
        if (tb1.getTxnNo()!=null) {
            mailService.sendMail(tb1.getRegistrationId());
            return "Transaction Added Successfully";
        }
        else {
            return "Failed to Add Transaction!";
        }
    }

    @Override
    public List<TransactionBean> viewTxns() {
        return transactionRepository.findAll();
    }

    @Override
    public List<TransactionBean> viewById(Integer id) {
        return transactionRepository.findByRegistrationId(id);
    }


}
