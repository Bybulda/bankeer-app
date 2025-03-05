package project.bank.bankeer.repository;

import org.springframework.data.repository.CrudRepository;
import project.bank.bankeer.model.AccountInfo;

public interface AccountRepo extends CrudRepository<AccountInfo, Long> {
}
