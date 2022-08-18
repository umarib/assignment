package com.controller;

import com.dto.AccountDTO;
import com.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*
        This is the rest controller for end point
        Note: this controller is incomplete just write it to explain my coding hierarchy
 */


@RestController
@RequestMapping("/account")
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    /*
     ***************  withdraw to DB code can be more refactor just write controller for structure
     */

    @RequestMapping(value = "/{account_id}", method = RequestMethod.GET, consumes = "application/json", headers = "Content-Type=application/json", produces = "application/json")
    public ResponseEntity withdraw(@PathVariable("account_id") Integer accountID) {
        logger.info("in method AccountController.withdraw");
        AccountDTO dto = null;
        ResponseEntity responseEntity=null;
        try {
            dto = this.accountService.withdraw(accountID);
            if (null == dto) {
                responseEntity = new ResponseEntity("Empty Response", HttpStatus.OK);
            }
            else {
                responseEntity = new ResponseEntity(dto, HttpStatus.OK);
            }
        } catch (Exception e) {
            logger.error("", e);
            responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    /*
            ***************  saving account to DB code can be more refactor just write controller for structure
     */

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", headers = "Content-Type=application/json", produces = "application/json")
    public ResponseEntity saveAccountInfo(@RequestBody AccountDTO accountDTO) {

        logger.info("in method AccountController.saveAccountInfo");
        ResponseEntity responseEntity = null;
        try {
            Boolean status = this.accountService.deposit(accountDTO);
            responseEntity = new ResponseEntity(status, HttpStatus.OK);
        }catch (Exception exception){
            logger.error(exception.getMessage());
            responseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
}
