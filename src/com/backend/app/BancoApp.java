package com.backend.app;

import com.backend.domain.ContaBancaria;
import com.backend.dto.ContaResumoDTO;
import com.backend.service.ContaService;

import java.math.BigDecimal;

public class BancoApp {

    public static void main (String[] args) {

        ContaBancaria conta = new ContaBancaria("00001");
        ContaService service = new ContaService();

        service.depositar(conta, new BigDecimal("200.00"));
        service.sacar(conta, new BigDecimal("50.00"));

        ContaResumoDTO resumo = service.obterResumo(conta);

        System.out.println("Conta: " + resumo.getNumeroConta());
        System.out.println("Saldo: " + resumo.getSaldo());
    }
}
