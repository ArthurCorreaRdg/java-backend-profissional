package com.backend.service;

import java.math.BigDecimal;
import com.backend.domain.ContaBancaria;
import com.backend.dto.ContaResumoDTO;
import com.backend.exception.SaldoInsuficienteException;
import com.backend.repository.ContaRepository;

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

    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public void realizarSaldo(long contaId, BigDecimal valor){
            ContaBancaria conta = repository.buscarPorId(contaId);
            conta.sacar(valor);
            repository.salvar(conta);
    }

    public boolean podeSacar(ContaBancaria conta, BigDecimal valor){
        return conta.temSaldo(valor);
    }

}
