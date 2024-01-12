package com.rangga.belajar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rangga.belajar.models.bukuModel;

@Repository
public interface bukuRepository extends JpaRepository<bukuModel, Integer>{
	
	@Query(value = "select judul,ketersediaan, penerbit,penulis from buku_pinjam where ketersediaan = ?1",nativeQuery = true)
	public List<Object> data(Boolean tersedia);

}
