package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TaxDetails;

public interface TaxDetailsRepository extends JpaRepository<TaxDetails, String> {

}