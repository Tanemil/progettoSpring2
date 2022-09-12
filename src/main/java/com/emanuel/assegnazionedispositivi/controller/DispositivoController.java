package com.emanuel.assegnazionedispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emanuel.assegnazionedispositivi.entity.Dispositivo;
import com.emanuel.assegnazionedispositivi.services.DispositivoServices;

public class DispositivoController {
	
	@Autowired
	private DispositivoServices dispositivoService;

	@GetMapping
	public List<Dispositivo> trovaTutti() {
		return dispositivoService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Dispositivo trovaPerId(@PathVariable Long id) {
		return dispositivoService.trovaPerId(id);
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		dispositivoService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Dispositivo dispositivo) {
		dispositivoService.crea(dispositivo);
	}
	
	@PutMapping
	public void modifica(@RequestBody Dispositivo dispositivo) {
		dispositivoService.modifica(dispositivo);
	}
}
