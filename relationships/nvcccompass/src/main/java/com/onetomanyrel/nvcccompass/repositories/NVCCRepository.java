package com.onetomanyrel.nvcccompass.repositories;

import java.util.List;
import java.util.Optional;

import com.onetomanyrel.nvcccompass.models.NVCC;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NVCCRepository extends CrudRepository<NVCC, Long> {
    List<NVCC> findAll();
    Optional<NVCC> findById(Long id);
    List<NVCC> findByName(String name);
    
}
