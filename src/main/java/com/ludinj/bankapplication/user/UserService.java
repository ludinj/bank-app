package com.ludinj.bankapplication.user;

import com.ludinj.bankapplication.bank.BankResponse;
import com.ludinj.bankapplication.bank.CreditDebitRequest;
import com.ludinj.bankapplication.bank.EnquiryRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);
}