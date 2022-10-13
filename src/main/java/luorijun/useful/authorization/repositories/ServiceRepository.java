package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Service;

public interface ServiceRepository extends JpaRepositoryImplementation<Service, Long> {
}
