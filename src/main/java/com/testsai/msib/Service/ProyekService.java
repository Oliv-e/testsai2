package com.testsai.msib.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsai.msib.Entity.Proyek;
import com.testsai.msib.Repository.ProyekRepo;

@Service
public class ProyekService {
	@Autowired
	private ProyekRepo proyekRepo;
	
	public Proyek simpanProyek(Proyek proyek) {
		return proyekRepo.save(proyek);
	}
	public List<Proyek> dataProyek() {
		return proyekRepo.findAll();
	}
	public Proyek updateProyek(Proyek proyek) {
		Proyek dataProyek = proyekRepo.findById(proyek.getId()).orElse(null);
	    if(dataProyek!=null) {
	    	dataProyek.setNamaProyek(proyek.getNamaProyek());
	    	dataProyek.setClient(proyek.getClient());
	    	dataProyek.setTglMulai(proyek.getTglMulai());
	    	dataProyek.setTglSelesai(proyek.getTglSelesai());
	    	dataProyek.setPimpinanProyek(proyek.getPimpinanProyek());
	    	dataProyek.setKeterangan(proyek.getKeterangan());
	    	dataProyek.setCreatedAt(dataProyek.getCreatedAt());
		    return proyekRepo.save(dataProyek);
	    }
	    return null;
	}
	public Proyek hapusProyek(Proyek proyek) {
		Proyek dataProyek = proyekRepo.findById(proyek.getId()).orElse(null);
	    if(dataProyek!=null) {
	    	proyekRepo.deleteById(dataProyek.getId());
	    }
	    return null;
	}
}
