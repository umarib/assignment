package com.dao;

import com.entity.Account;
import com.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Optional;

public class AccountDaoImpl implements AccountDao {

    @Autowired
    private AccountRepository accountRepository;


    @Transactional
    @Override
    public boolean deposit(Account account) throws SQLException {
        this.accountRepository.save(account);
        return true;
    }


    @Override
    public Optional<Account> withdraw(Integer accountID) throws SQLException {
       return this.accountRepository.findById(accountID);
    }



}
