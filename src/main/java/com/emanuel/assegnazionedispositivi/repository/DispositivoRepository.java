package com.emanuel.assegnazionedispositivi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.assegnazionedispositivi.entity.Dispositivo;

@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {

}
