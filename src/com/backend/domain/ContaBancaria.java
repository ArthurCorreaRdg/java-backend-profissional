package com.backend.domain;

import com.backend.exception.SaldoInsuficienteException;

import java.math.BigDecimal;

public class ContaBancaria {

    private BigDecimal saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = BigDecimal.ZERO;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal saldoAtual(){
        return saldo;
    }

    public boolean temSaldo(BigDecimal valor) {
        return saldo.compareTo(valor) >=0;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new SaldoInsuficienteException("Valor inválido");
        }
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new SaldoInsuficienteException("Valor inválido");
        }
        if (valor.compareTo(saldo) > 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }
}
