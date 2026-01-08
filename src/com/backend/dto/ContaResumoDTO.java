package com.backend.dto;

import java.math.BigDecimal;

public class ContaResumoDTO {

    private final String numeroConta;
    private final BigDecimal saldo;

    public ContaResumoDTO(String numeroConta, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}