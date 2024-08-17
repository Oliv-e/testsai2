package com.testsai.msib.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsai.msib.Entity.LokasiProyek;
import com.testsai.msib.Repository.LokasiProyekRepo;

@Service
public class LokasiProyekService {
	
	@Autowired
	private LokasiProyekRepo lokasiProyekRepo;
	
	public List<LokasiProyek> dataLP() {
		return lokasiProyekRepo.findAll();
	}
}
