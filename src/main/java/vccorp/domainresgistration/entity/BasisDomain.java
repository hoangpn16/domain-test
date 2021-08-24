//package vccorp.domainresgistration.repository.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Table(name = "basis_domain")
//@Entity
//@Getter @Setter
//public class BasisDomain extends BaseEntity{
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "basis_id")
//    private Basis basis;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "domain_id")
//    private DomainEntity domainEntity;
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "current_mode_id")
//    private Mode currentMode;
//
//    @OneToMany(mappedBy ="basisDomain",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    List<BasisDomainMode> listBasisDomainModes = new ArrayList<>();
//}
