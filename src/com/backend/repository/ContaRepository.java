package com.backend.repository;

import com.backend.domain.ContaBancaria;

import java.math.BigDecimal;

public interface ContaRepository {

    ContaBancaria buscarPorId(long contaId);

    void salvar(ContaBancaria conta);

}
