package com.dmv.registration.repositories;

import com.dmv.registration.models.License;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
    
}
