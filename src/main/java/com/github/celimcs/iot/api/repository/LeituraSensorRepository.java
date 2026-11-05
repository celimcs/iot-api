package com.github.celimcs.iot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.celimcs.iot.api.model.LeituraSensor;

public interface LeituraSensorRepository extends JpaRepository<LeituraSensor, Long>{

}
