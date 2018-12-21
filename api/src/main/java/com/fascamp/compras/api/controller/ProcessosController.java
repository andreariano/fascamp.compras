package com.fascamp.compras.api.controller;

import com.fascamp.compras.api.mapping.ProcessoMapper;
import com.fascamp.compras.api.model.ProcessoDTO;
import com.fascamp.compras.service.ProcessosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/processos")
public class ProcessosController {
    @Autowired
    private ProcessosService processosService;

    @Autowired
    private ProcessoMapper processoMapper;

    public ProcessosController(ProcessosService processoService, ProcessoMapper processoMapper) {
        this.processosService = processoService;
        this.processoMapper = processoMapper;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ProcessoDTO> getAllProcessos() {
        return this.processoMapper.mapFrom(this.processosService.getAllProcessos());
    }
}
