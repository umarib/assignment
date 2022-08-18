package com.assignment.demo.service;

import com.dto.AccountDTO;
import com.dto.UserDTO;
import com.repository.AccountRepository;
import com.service.AccountService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/*
    Service layer testing be like this
    Not completed
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class ServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(ServiceTest.class);

    @InjectMocks
    private AccountService service;

    @Mock
    private AccountRepository repository;

    @Rule
    public TestName testName = new TestName();

    @Test
    public void DepositAccountTest() throws Exception{
        AccountDTO accountDTO = new AccountDTO();
        UserDTO userDTO = new UserDTO();
        accountDTO.setBalance(new BigDecimal(12345678910.00));
        accountDTO.setCurrency("$ USD");
        accountDTO.setUser(userDTO);
        logger.info("accountDTO added");

        assert(true);
    }


//    @Test
//    public void WidrawAccountTest() throws Exception{
//        AccountDTO accountDTO = new AccountDTO();
//        UserDTO userDTO = new UserDTO();
//        accountDTO.setBalance(new BigDecimal(12345678910.00));
//        accountDTO.setCurrency("$ USD");
//        accountDTO.setUser(userDTO);
//        logger.info("accountDTO added");
//
//        assert(true);
//    }
}
