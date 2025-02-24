package com.prodetect.fraud.services.TransactionsService;


import com.prodetect.fraud.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{



    @Override
    public String filterTransactions(Transaction transaction) {



        transaction.getIp();
        transaction.getDevice();
        transaction.getDeviceId();
        transaction.getCurrency();
        transaction.getTransactionAmount();
        transaction.getTransactionType();
        transaction.getFirstName();
        transaction.getLastName();
        transaction.getNationality();
        transaction.getSourceCountry();
        transaction.getDestinationCountry();
        transaction.getReceiverFirstName();
        transaction.getReceiverLastName();

        return null;
    }


}
