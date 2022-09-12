package com.emanuel.assegnazionedispositivi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.assegnazionedispositivi.entity.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
