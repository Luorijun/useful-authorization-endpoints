package luorijun.useful.authorization.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import luorijun.useful.authorization.entities.Agent;

public interface AgentRepository extends JpaRepositoryImplementation<Agent, Long> {
}
