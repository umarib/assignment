package com.dao;

import com.entity.Account;

import java.sql.SQLException;
import java.util.Optional;

public interface AccountDao {

    public boolean deposit(Account account) throws SQLException;
    public Optional<Account> withdraw(Integer accountID) throws SQLException;
}
