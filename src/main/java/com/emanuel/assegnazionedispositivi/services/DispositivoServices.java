package com.emanuel.assegnazionedispositivi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuel.assegnazionedispositivi.entity.Dispositivo;
import com.emanuel.assegnazionedispositivi.repository.DispositivoRepository;

@Service
public class DispositivoServices {

	@Autowired
	private DispositivoRepository repo;
	
	public List<Dispositivo> trovaTutti() {
		return (List<Dispositivo>) repo.findAll();
	}
	
	public Dispositivo trovaPerId(Long id) {
		return repo.findById(id).get();
	}
	
	public void cancella(Long id) {
		repo.deleteById(id);
	}
	
	public void crea(Dispositivo libro) {
		repo.save(libro);
	}
	
	public void modifica(Dispositivo libro) {
		repo.save(libro);
	}
}
