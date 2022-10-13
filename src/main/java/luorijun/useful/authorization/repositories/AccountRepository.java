package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Account;

public interface AccountRepository extends JpaRepositoryImplementation<Account, Long> {
}
