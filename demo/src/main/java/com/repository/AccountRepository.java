package com.repository;

import com.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    All Queries should be written here
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
