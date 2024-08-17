package com.testsai.msib.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsai.msib.Entity.LokasiProyek;
import com.testsai.msib.Service.LokasiProyekService;

@RestController
public class LokasiProyekController {
	@Autowired
	private LokasiProyekService lokasiProyekService;
	
	@GetMapping(value = "/lokasi_proyek", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LokasiProyek> dataLP() {
		return lokasiProyekService.dataLP();
	}
}