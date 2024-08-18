package com.aloqaCRM.aloqaCRM.repository;

import com.aloqaCRM.aloqaCRM.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long>{

}
