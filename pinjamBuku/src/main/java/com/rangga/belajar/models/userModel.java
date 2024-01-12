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
@Table(name = "pengguna")
public class userModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nama")
	private String nama;
	
	@Column(name = "nomor_telepon")
	private String nomor_telepon;
	
	@Column(name="tahun_lahir")
	private int tahun_lahir;
	
	@Column(name="id_buku")
	private int id_buku;
}
