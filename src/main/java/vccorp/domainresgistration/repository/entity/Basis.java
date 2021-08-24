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
//@Entity
//@Table(name = "basis")
//@Getter @Setter
//public class Basis extends BaseEntity {
//    @Column(name = "basis_name")
//    private String name;
//
//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private Status status;
//
//    @OneToMany(mappedBy = "basis",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    List<BasisDomain> listBasisDomains = new ArrayList<>();
//}
