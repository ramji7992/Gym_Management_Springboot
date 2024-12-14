package com.rj.controller;

import com.rj.binding.TransactionBean;
import com.rj.services.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    ITransactionService transactionService;

    @GetMapping("/addTxn")
    public String showTxnPage(Model model){
        TransactionBean tb = new TransactionBean();
        model.addAttribute("txn",tb);
        return "AddTransaction";
    }
    @PostMapping("/addtxn")
    public String addTxn(TransactionBean tb, Model model){
        tb.setDate(Date.from(Instant.now()));
        String msg = transactionService.addTxn(tb);
        model.addAttribute("msg", msg);
        return "WelcomeOwner";
    }
    @GetMapping("/viewTxns")
    public String viewTxns(Model model){
        List<TransactionBean> list = transactionService.viewTxns();
        model.addAttribute("txns", list);
        return "Transactions";
    }
    @GetMapping("/viewTxn")
    public String viewById(Model model){
        TransactionBean tb = new TransactionBean();
        model.addAttribute("txnbyid", tb);
        return "ViewTxnById";
    }
    @PostMapping("/viewTxnById")
    public String viewTxn(TransactionBean tb, Model model){
        List<TransactionBean> list = transactionService.viewById(tb.getRegistrationId());
        model.addAttribute("txn",list);
        return "ViewTxnsById";
    }
}
