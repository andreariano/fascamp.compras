package com.fascamp.compras.service;

import com.fascamp.compras.model.Processo;
import com.fascamp.compras.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessosServiceImpl implements ProcessosService {
    @Autowired
    private ProcessoRepository processoRepository;

    @Override
    public List<Processo> getAllProcessos() {
        return this.processoRepository.getList();
    }
}
