package com.cydeo.fintracker.entity;


import com.cydeo.fintracker.entity.common.BaseEntity;
import com.cydeo.fintracker.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
