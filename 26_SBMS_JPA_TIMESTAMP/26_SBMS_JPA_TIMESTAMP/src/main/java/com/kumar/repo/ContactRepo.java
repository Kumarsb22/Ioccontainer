package com.kumar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kumar.entities.ContactInfoEntity;

@Repository
public interface ContactRepo extends JpaRepository<ContactInfoEntity, Integer> {

}
