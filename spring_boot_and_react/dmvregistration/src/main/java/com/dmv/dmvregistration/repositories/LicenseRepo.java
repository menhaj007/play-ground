package com.dmv.dmvregistration.repositories;

import java.util.List;
import java.util.Optional;

import com.dmv.dmvregistration.models.License;
import com.dmv.dmvregistration.models.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long> {
    Optional<License> findById(Long id);
    List<License> findAll();
    List<License> findByNumber(String number);
    List<License> findByState(String state);
    List<License> deleteByNumber(String number);
    List<License> findByPerson(Person person);


}