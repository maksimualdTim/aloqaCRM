package com.aloqaCRM.aloqaCRM.repository;

import com.aloqaCRM.aloqaCRM.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
