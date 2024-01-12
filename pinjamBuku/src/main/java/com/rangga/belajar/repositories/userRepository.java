package com.rangga.belajar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.belajar.models.userModel;

@Repository
public interface userRepository extends JpaRepository<userModel, Integer>{
	

}
