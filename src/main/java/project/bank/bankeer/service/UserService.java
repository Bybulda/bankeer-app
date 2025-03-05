package project.bank.bankeer.service;

import org.springframework.stereotype.Service;
import project.bank.bankeer.model.UserInfo;

@Service
public class UserService {

    public boolean registerUser(UserInfo user) {
        return true;
    }

    public boolean loginUser(UserInfo user) {
        return true;
    }

    public UserInfo deleteUser(UserInfo user) {
        return user;
    }

    public UserInfo updateUser(UserInfo user) {
        return user;
    }
}
