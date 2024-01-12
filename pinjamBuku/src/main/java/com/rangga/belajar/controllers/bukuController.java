package com.rangga.belajar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.belajar.models.bukuModel;
import com.rangga.belajar.services.bukuService;

@RestController
public class bukuController {
	
	@Autowired
	private bukuService bs;
	
	@GetMapping("/buku")
	public List<bukuModel> dataAll(){
		return bs.dataAll();
	}
	
	@PostMapping("/buku")
	public bukuModel tambahBuku (@RequestBody bukuModel model) {
		return bs.tambahBuku(model);
	}

	@GetMapping("/buku/{tersedia}")
	public List<Object> data(@PathVariable Boolean tersedia){
		return bs.data(tersedia);
	}
	
	@GetMapping("/buku/check/{id}")
	public String checkDataById(@PathVariable int id) {
		return bs.getDataById(id);
	}
	
	@PutMapping("/buku/{id}")
	public int gantiStatus(@RequestBody bukuModel model, @PathVariable int id) {
		return bs.gantiStatus(model, id);
	}
}
