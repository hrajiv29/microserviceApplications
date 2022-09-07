package com.xoriant.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.interview.entity.Citizen;


public interface CitizenRepository extends JpaRepository<Citizen, Integer>{

	public List<Citizen> findByVaccinationCenterId(Integer id);
	
	
	
}
