package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Approval;

public interface ApprovalRepository extends JpaRepositoryImplementation<Approval, Long> {
}
