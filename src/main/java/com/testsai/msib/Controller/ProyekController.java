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

import com.testsai.msib.Entity.Proyek;
import com.testsai.msib.Service.ProyekService;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class ProyekController {
	@Autowired
	private ProyekService proyekService;
	
	@GetMapping(value = "/proyek", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Proyek> dataProyek() {
		return proyekService.dataProyek();
	}
	@PostMapping(value = "/proyek", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Proyek kirimProyek(@RequestBody Proyek proyek) {
		return proyekService.simpanProyek(proyek);
	}
	@PutMapping(value = "/proyek", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Proyek updateProyek(@RequestBody Proyek proyek) {
        return proyekService.updateProyek(proyek);
    }
	@DeleteMapping(value = "/proyek", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Proyek deleteProyek(@RequestBody Proyek proyek) {
	    return proyekService.hapusProyek(proyek);
	}
}
