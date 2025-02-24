package com.prodetect.fraud.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/transactions")
public class TransactionsController {

    @GetMapping(value="/viewSuspendedTransaction",consumes= MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public String viewSuspendedTransactions(){
        return null;
    }


    @PostMapping(value="/manageTransactions",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public String manageTransactions(){
        return null;
    }




    @PostMapping(value="/filterTransactions",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public String filterTransactions(){
        return null;
    }


}
