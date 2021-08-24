package vccorp.domainresgistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vccorp.domainresgistration.entity.GroupEntity;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,Integer> {
    GroupEntity findOneByGroupName(String groupName);

}
