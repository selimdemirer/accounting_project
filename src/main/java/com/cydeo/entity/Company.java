package com.cydeo.entity;

import com.cydeo.entity.common.BaseEntity;
import com.cydeo.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "companies")
public class Company extends BaseEntity {

    @Column(name = "title",unique = true)
    private String title;

    @Column(name = "phone")
    private String phone;

    @Column(name = "website")
    private String website;

    @Enumerated(EnumType.STRING)
    @Column(name = "company_status")
    private CompanyStatus companyStatus;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
