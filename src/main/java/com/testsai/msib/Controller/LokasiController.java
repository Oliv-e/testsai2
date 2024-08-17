package com.testsai.msib.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testsai.msib.Entity.Lokasi;
import com.testsai.msib.Service.LokasiService;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class LokasiController {
	
	@Autowired
	private LokasiService lokasiService;
	
	@GetMapping(value = "/lokasi", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lokasi> dataLokasi() {
		return lokasiService.dataLokasi();
	}
	@PostMapping(value = "/lokasi", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Lokasi kirimLokasi(@RequestBody Lokasi lokasi) {
		return lokasiService.simpanLokasi(lokasi);
	}
	@PutMapping(value = "/lokasi", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Lokasi updateLokasi(@RequestBody Lokasi lokasi) {
        return lokasiService.updateLokasi(lokasi);
    }
	@DeleteMapping(value = "/lokasi", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Lokasi deleteLokasi(@RequestBody Lokasi lokasi) {
	    return lokasiService.hapusLokasi(lokasi);
	}
}
