package com.javareact.jrct.repositories;

import org.springframework.stereotype.Repository;

import com.javareact.jrct.models.Client;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
