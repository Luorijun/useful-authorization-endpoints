package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Tenant;

public interface TenantRepository extends JpaRepositoryImplementation<Tenant, Long> {
}
