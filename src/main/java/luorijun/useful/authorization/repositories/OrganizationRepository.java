package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Organization;

public interface OrganizationRepository extends JpaRepositoryImplementation<Organization, Long> {
}
