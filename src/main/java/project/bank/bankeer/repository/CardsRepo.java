package project.bank.bankeer.repository;

import org.springframework.data.repository.CrudRepository;
import project.bank.bankeer.model.CardsInfo;

public interface CardsRepo extends CrudRepository<CardsInfo, Long> {
}
