package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Client;

public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {
}
