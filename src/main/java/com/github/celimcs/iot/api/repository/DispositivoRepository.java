package com.github.celimcs.iot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.celimcs.iot.api.model.Dispositivo;

public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {

}
