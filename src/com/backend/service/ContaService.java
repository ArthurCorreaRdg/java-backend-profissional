package com.backend.service;

import java.math.BigDecimal;
import com.backend.domain.ContaBancaria;
import com.backend.dto.ContaResumoDTO;

public class ContaService {

    public ContaResumoDTO obterResumo(ContaBancaria conta) {
        return new ContaResumoDTO(
                conta.getNumeroConta(),
                conta.saldoAtual()
        );
    }

    public void depositar(ContaBancaria conta, BigDecimal valor){
        conta.depositar(valor);
    }

    public void sacar(ContaBancaria conta, BigDecimal valor){
        conta.sacar(valor);
    }

    public boolean podeSacar(ContaBancaria conta, BigDecimal valor){
        return conta.temSaldo(valor);
    }

}
