package project.bank.bankeer.repository;

import org.springframework.data.repository.CrudRepository;
import project.bank.bankeer.model.UserInfo;

public interface UserRepo extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
    public UserInfo findByEmail(String email);
    public UserInfo deleteUserInfoById(Long id);
}
