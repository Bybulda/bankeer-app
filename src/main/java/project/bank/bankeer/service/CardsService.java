package project.bank.bankeer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.bank.bankeer.model.CardsInfo;
import project.bank.bankeer.model.UserInfo;
import project.bank.bankeer.repository.CardsRepo;

import java.util.List;

@Service
public class CardsService {
    @Autowired
    private CardsRepo cardsRepo;

    public boolean openNewProduct(String description, String type, UserInfo user){
        return false;
    }

    public boolean closeProduct(String description, String type){
        return false;
    }

    public boolean sendMoney(UserInfo user, CardsInfo card, String telephoneOrCardNumber){
        return false;
    }

    public boolean withdrawMoney(CardsInfo card){
        return false;
    }

    public boolean placeMoney(CardsInfo card, Long amount){
        return false;
    }

    public CardsInfo getCardInfo(String cardNumber){
        return null;
    }

    public List<CardsInfo> getAllCardsInfo(UserInfo user){
        return null;
    }

    public List<String> getCardHistory(CardsInfo card){
        return null;
    }
}
