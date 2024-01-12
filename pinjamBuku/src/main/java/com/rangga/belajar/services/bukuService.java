package com.rangga.belajar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rangga.belajar.models.bukuModel;
import com.rangga.belajar.repositories.bukuRepository;

@Service
@Transactional
public class bukuService {
	
	@Autowired
	private bukuRepository br;
	
	public List<bukuModel> dataAll(){
		return br.findAll();
	}
	
	public bukuModel tambahBuku (bukuModel model) {
		bukuModel temp = new bukuModel();
		temp.setJudul(model.getJudul());
		temp.setPenulis(model.getPenulis());
		temp.setPenerbit(model.getPenerbit());
		temp.setKetersediaan(true);
		return br.save(temp);
	}

	public List<Object> data(Boolean tersedia){
		return br.data(tersedia);
	}
	
	//dibuat hanya untuk validasi nantinya
	public String getDataById(int id) {
		Integer ids = id;
		String pesan = "";
		if (ids != null && ids > 0) {
			bukuModel model = br.findById(id).orElse(null);
			if(model != null) {
			 br.findById(id).get();
			 pesan ="berhasil";
			 System.out.println(pesan);
			}else {
				pesan="gagal";
			}
			
		}else {
			 pesan ="Gagal";

		}
		return pesan;
	}
	
	public int gantiStatus(bukuModel model, int id) {
		bukuModel temp = new bukuModel();
		int status = 0;
		temp = br.findById(id).get();
		if (temp.getKetersediaan() != null) {
			temp.setKetersediaan(model.getKetersediaan());
			status = 1;
		}
		return status;
		
	}
}
