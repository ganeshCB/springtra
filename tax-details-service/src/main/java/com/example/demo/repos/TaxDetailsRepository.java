package com.example.demo.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TaxDetails;

@Repository
public interface TaxDetailsRepository extends JpaRepository<TaxDetails, String>{

}

