package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Permission;

public interface PermissionRepository extends JpaRepositoryImplementation<Permission, Long> {
}
