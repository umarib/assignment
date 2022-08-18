package com.service;

import com.dto.AccountDTO;


public interface AccountService {

    public boolean deposit(AccountDTO account) throws Exception;
    public AccountDTO withdraw(Integer accountID) throws Exception;
}
