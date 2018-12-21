package com.fascamp.compras.api.mapping;

import com.fascamp.compras.api.model.ProcessoDTO;
import com.fascamp.compras.model.Processo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProcessoMapperImpl implements ProcessoMapper {
    private static ProcessoDTO  map(Processo processo) {
        ProcessoDTO processoDTO = new ProcessoDTO();
        processoDTO.setNumeroProcesso(processo.getNumeroProcesso());

        return processoDTO;
    }

    @Override
    public List<ProcessoDTO> mapFrom(List<Processo> processos) {
        return processos.stream().map(ProcessoMapperImpl::map).collect(Collectors.toList());
    }
}
