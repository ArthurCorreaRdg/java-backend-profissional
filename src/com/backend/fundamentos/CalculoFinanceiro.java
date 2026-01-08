package com.backend.fundamentos;

import java.math.BigDecimal;

public class CalculoFinanceiro {

    public static void main(String[] args) {
        BigDecimal valor1 = new BigDecimal("0.10");
        BigDecimal valor2 = new BigDecimal("0.20");

        BigDecimal resultado = valor1.add(valor2);

        System.out.println(resultado);
    }
}
