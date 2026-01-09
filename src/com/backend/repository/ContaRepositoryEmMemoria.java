package com.backend.repository;

import com.backend.domain.ContaBancaria;

import java.util.HashMap;
import java.util.Map;

public class ContaRepositoryEmMemoria implements ContaRepository {

    private Map<Long, ContaBancaria> banco = new HashMap<>();


    @Override
    public ContaBancaria buscarPorId(long contaId) {
        return banco.get(contaId);
    }

    @Override
    public void salvar(ContaBancaria conta) {
        banco.put(Long.parseLong(conta.getNumeroConta()), conta);
    }
}
