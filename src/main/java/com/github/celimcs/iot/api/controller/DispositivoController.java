package com.github.celimcs.iot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.celimcs.iot.api.model.Dispositivo;
import com.github.celimcs.iot.api.repository.DispositivoRepository;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {
	
	@Autowired
    private DispositivoRepository dispositivoRepository;
	
	@GetMapping
    public List<Dispositivo> listar() {
        return dispositivoRepository.findAll();
	}
}
