package vccorp.domainresgistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vccorp.domainresgistration.entity.DomainEntity;

@Repository
public interface DomainRepository extends JpaRepository<DomainEntity,Integer> {
}
