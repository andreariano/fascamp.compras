package com.fascamp.compras.repository;

import com.fascamp.compras.model.Processo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProcessoRepositoryStub implements ProcessoRepository {
    @Override
    public List<Processo> getList() {
        Processo processo1 = new Processo();
        processo1.setNumeroProcesso(123);
        Processo processo2 = new Processo();
        processo2.setNumeroProcesso(456);
        Processo processo3 = new Processo();
        processo3.setNumeroProcesso(789);

        ArrayList<Processo> processos = new ArrayList<>();
        processos.add(processo1);
        processos.add(processo2);
        processos.add(processo3);

        return processos;
    }
}
