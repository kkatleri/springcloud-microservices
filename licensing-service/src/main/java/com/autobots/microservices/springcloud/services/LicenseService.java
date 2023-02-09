package com.autobots.microservices.springcloud.services;

import com.autobots.microservices.springcloud.config.ServiceConfig;
import com.autobots.microservices.springcloud.model.License;
import com.autobots.microservices.springcloud.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService {

    @Autowired
    LicenseRepository licenseRepository;

    @Autowired
    ServiceConfig serviceConfig;
    public License getLicense(String organizationId, String licenseId){
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license.withComment(serviceConfig.getExampleProperty());
    }

    public void saveLicense(License license){

    }

    public void updateLicense(License license){

    }

    public void deleteLicense(License license){

    }

}
