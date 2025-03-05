package project.bank.bankeer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import project.bank.bankeer.service.AccountService;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
}
