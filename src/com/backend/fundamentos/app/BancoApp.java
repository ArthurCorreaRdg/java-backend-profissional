package com.backend.fundamentos.app;

import com.backend.fundamentos.domain.ContaBancaria;

import java.math.BigDecimal;

public class BancoApp {

    public static void main (String[] args) {

        String numeroConta = "";
        var saldo = "";

        ContaBancaria conta = new ContaBancaria("00001");

        conta.depositar(new BigDecimal("200.00"));
        conta.sacar(new BigDecimal("50.00"));

        System.out.println("Saldo final: " +  conta.getSaldo());
    }
}
