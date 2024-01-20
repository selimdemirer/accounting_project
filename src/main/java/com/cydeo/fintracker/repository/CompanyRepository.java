package com.cydeo.fintracker.repository;


import com.cydeo.fintracker.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Optional<Company> findById(Long companyId);

    @Query("select c from Company c")
    List<Company> getCompanies();

}