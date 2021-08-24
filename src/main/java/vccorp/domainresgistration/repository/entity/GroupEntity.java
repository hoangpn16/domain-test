package vccorp.domainresgistration.repository.entity;

import lombok.Getter;
import lombok.Setter;
import vccorp.domainresgistration.enumerates.Status;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
@Getter @Setter
public class GroupEntity extends BaseEntity{
    private String groupName;
    private String description;
    private String status;

    @ManyToMany(mappedBy = "listGroups",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<DomainEntity> domains = new ArrayList<>();
}
