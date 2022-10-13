package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Role;

public interface RoleRepository extends JpaRepositoryImplementation<Role, Long> {
}
