package com.dmv.dmvregistration.services;

import java.util.List;
import java.util.Optional;

import com.dmv.dmvregistration.models.License;
import com.dmv.dmvregistration.repositories.LicenseRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {
    @Autowired
    private LicenseRepo licenseRepo;

    public List<License> showAllLicenses() {
        return licenseRepo.findAll();
    }
    public License getALicense(Long id) {
        Optional<License> license = licenseRepo.findById(id);
        if (license.isPresent()) {
            return license.get();
        }
        return null;
    }
    public License findByNumber(String number) {
        License license = (License) licenseRepo.findByNumber(number);
        // if (license != null)
        //     return license;
        return license;

    }
    public License save(License newLicense) {
        if (newLicense != null)
            return licenseRepo.save(newLicense);
        else throw new NullPointerException("Null input was passed.");
    }

    
}
