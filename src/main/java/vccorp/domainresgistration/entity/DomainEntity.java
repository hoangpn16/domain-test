package vccorp.domainresgistration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "domains")
@Getter
@Setter
public class DomainEntity extends BaseEntity {
    private String domainName;

    private String logType;

    private String domainType;

    private String status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "domain_group", joinColumns = @JoinColumn(name = "domain_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<GroupEntity> listGroups = new ArrayList<>();


}
