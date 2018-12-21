package com.fascamp.compras.api.mapping;

import com.fascamp.compras.api.model.ProcessoDTO;
import com.fascamp.compras.model.Processo;

import java.util.List;

public interface ProcessoMapper {
    List<ProcessoDTO> mapFrom(List<Processo> processos);
}
