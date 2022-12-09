package com.vodafone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vodafone.model.VodafoneModel;

@Repository
public interface VodafoneRepo extends JpaRepository<VodafoneModel, Integer>{
 public VodafoneModel findByempId(Integer empId);
}
