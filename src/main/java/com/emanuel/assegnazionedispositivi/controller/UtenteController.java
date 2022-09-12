package com.emanuel.assegnazionedispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emanuel.assegnazionedispositivi.entity.Utente;
import com.emanuel.assegnazionedispositivi.services.UtenteServices;


public class UtenteController {
	
	@Autowired
	private UtenteServices utenteService;

	@GetMapping
	public List<Utente> trovaTutti() {
		return utenteService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Utente trovaPerId(@PathVariable Long id) {
		return utenteService.trovaPerId(id);
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		utenteService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Utente utente) {
		utenteService.crea(utente);
	}
	
	@PutMapping
	public void modifica(@RequestBody Utente utente) {
		utenteService.modifica(utente);
	}
}
