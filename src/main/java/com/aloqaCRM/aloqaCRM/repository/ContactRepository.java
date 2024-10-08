package com.aloqaCRM.aloqaCRM.repository;

import com.aloqaCRM.aloqaCRM.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
