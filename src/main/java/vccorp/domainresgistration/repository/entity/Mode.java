//package vccorp.domainresgistration.repository.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import vccorp.domainresgistration.enumerates.Status;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Table(name = "mode")
//@Entity
//@Getter @Setter
//public class Mode extends BaseEntity{
//    @Column(name = "mode_name")
//    private String modeName;
//
//    @Column(name = "level_priority")
//    private String levelPriority;
//
//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private Status status;
//
//    @OneToMany(mappedBy = "mode",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    List<BasisDomainMode> listBasisDomainModes = new ArrayList<>();
//
//    @OneToMany(mappedBy = "currentMode",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    List<BasisDomain> listBasisDomains = new ArrayList<>();
//}
