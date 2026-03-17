package org.example;

import br.com.alura.screenmatch.modelo.ContaBancaria;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setSaldo(5000);
        conta.setNumeroConta(123456);
        conta.titular = "Jullyen";

        System.out.println("Titular da conta: " +conta.titular);
        System.out.println("Seu Saldo é de " + conta.getSaldo());
        System.out.println("O número da sua conta é: " + conta.getNumeroConta());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
