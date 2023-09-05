package com.rrce.restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rrce.restapi.model.CloudVendor;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}

	

