package project.bank.bankeer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.bank.bankeer.repository.AccountRepo;
import project.bank.bankeer.repository.CardsRepo;
import project.bank.bankeer.repository.UserRepo;

@Service
public class AccountService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private CardsRepo cardsRepo;

}
