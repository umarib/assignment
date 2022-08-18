package com.assignment.demo.controller;

import com.controller.AccountController;
import com.dto.AccountDTO;
import com.dto.UserDTO;
import com.repository.AccountRepository;
import com.service.AccountService;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

/*
    Service layer testing be like this
    Not completed
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(AccountController.class)
//@ContextConfiguration(classes={Application.class})
//@ActiveProfiles({"test"})
@Ignore
public class ControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(ControllerTest.class);

    @Rule
    public TestName testName = new TestName();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService service;

    @Mock
    private AccountRepository repository;

    @MockBean
    private AccountController accountController;

    @Test
    @DisplayName("Withdraw")
    public void withdrawAmount() throws Exception {

//        MvcResult result  = mockMvc.perform(MockMvcRequestBuilders.get("/account")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk()).andReturn();
//        logger.info(">>>>>>>>>>>>>>>>>>>>>"+result.getResponse().getContentAsString());
    }
}
