package br.com.aps.banco;

import Exceptions.ContaException;
import Exceptions.MovimentacaoException;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    
    private double limite;

    public ContaPoupanca(long numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= (this.getSaldo() + limite)) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                throw new MovimentacaoException("Saldo e limite Insuficientes");
            }
        } else {
            throw new MovimentacaoException("Valor Inválido!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            throw new ContaException("Valor Inválido");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println(this.getNumeroConta());
        System.out.println(this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
        if (this.getSaldo() < 0) {
            System.out.println("Limite Disponível: " + (this.getLimite() - this.getSaldo()));
        } else {
            System.out.println("Limite Disponível: " + this.getLimite());
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
