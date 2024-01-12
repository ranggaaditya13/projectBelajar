package com.rangga.belajar.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="buku_pinjam")
public class bukuModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="judul")
	private String judul;
	
	@Column(name = "penulis")
	private String penulis;
	
	@Column(name = "penerbit")
	private String penerbit;
	
	@Column(name="ketersediaan")
	private Boolean ketersediaan;

}
