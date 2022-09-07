package com.xoriant.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.interview.entity.Citizen;


public interface CustomerRepository extends JpaRepository<Citizen, String>{

	public List<Citizen> findbyVaccinationCenterId(Integer id);
	
	
	
}
