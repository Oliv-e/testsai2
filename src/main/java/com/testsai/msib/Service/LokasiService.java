package com.testsai.msib.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsai.msib.Entity.Lokasi;
import com.testsai.msib.Repository.LokasiRepo;

@Service
public class LokasiService {
	
	@Autowired
	private LokasiRepo lokasiRepo;
	
	public Lokasi simpanLokasi(Lokasi lokasi) {
		return lokasiRepo.save(lokasi);
	}
	public List<Lokasi> dataLokasi() {
		return lokasiRepo.findAll();
	}
	public Lokasi updateLokasi(Lokasi lokasi) {
		Lokasi dataLokasi = lokasiRepo.findById(lokasi.getId()).orElse(null);
	    if(dataLokasi!=null) {
	    	dataLokasi.setNamaLokasi(lokasi.getNamaLokasi());
		    dataLokasi.setNegara(lokasi.getNegara());
		    dataLokasi.setProvinsi(lokasi.getProvinsi());
		    dataLokasi.setKota(lokasi.getKota());
		    dataLokasi.setCreatedAt(dataLokasi.getCreatedAt());
		    return lokasiRepo.save(dataLokasi);
	    }
	    return null;
	}
	public Lokasi hapusLokasi(Lokasi lokasi) {
		Lokasi dataLokasi = lokasiRepo.findById(lokasi.getId()).orElse(null);
	    if(dataLokasi!=null) {
		    lokasiRepo.deleteById(dataLokasi.getId());
	    }
	    return null;
	}
}
