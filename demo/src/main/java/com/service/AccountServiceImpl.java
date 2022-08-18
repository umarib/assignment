package com.service;

import com.dao.AccountDao;
import com.dto.AccountDTO;
import com.entity.Account;
import com.util.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/*
      In this class all logic will be implemented
 */

public class AccountServiceImpl implements AccountService{


    @Autowired
    public AccountDao accountDao;

    @Override
    @Transactional
    public boolean deposit(AccountDTO accountDTO) throws Exception{
        Account account = new Account();
        Translator.copyNotNullBeanProperties(accountDTO, account);
       return this.accountDao.deposit(account);
    }


    @Override
    public AccountDTO withdraw(Integer accountID) throws Exception {
        AccountDTO dto = new AccountDTO();
        Optional<Account> account = this.accountDao.withdraw(accountID);
        Translator.copyNotNullBeanProperties(account, dto);
        return dto;
    }
}
