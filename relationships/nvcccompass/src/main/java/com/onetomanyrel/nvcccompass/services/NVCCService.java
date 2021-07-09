package com.onetomanyrel.nvcccompass.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.onetomanyrel.nvcccompass.models.NVCC;
import com.onetomanyrel.nvcccompass.repositories.NVCCRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SystemPropertyUtils;

import javassist.NotFoundException;

@Service
public class NVCCService {
    @Autowired
    private NVCCRepository nvccRepository;
    
    public List<NVCC> nvccList() {
        return nvccRepository.findAll();
    }
    public Optional<NVCC> getANVCC(Long id) {
        return nvccRepository.findById(id);
    }
    
    public NVCC search(String name) {
        NVCC nvcc = (NVCC) nvccRepository.findByName(name);
        return nvcc;
    }
    public void destroy(Long id) {
        // NVCC nvcc = nvccRepository.findById(id).get();
        // if (nvcc != null)
        nvccRepository.deleteById(id);
        // return nvcc;
        
    }
    public NVCC updateNVCC(Long id, NVCC nvcc) {
        NVCC tmp = nvccRepository.findById(id).get();
        tmp.setName(nvcc.getName());
        return nvccRepository.save(tmp);
    }
    public NVCC update(NVCC nvcc) {
        return nvccRepository.save(nvcc);
    }
    public void create(NVCC nvcc) {
        if (nvcc.getName().length() < 2) {
            System.out.println("length is " + nvcc.getName().length());
            return;
        } else
        nvccRepository.save(nvcc);
    }
    



    
}
