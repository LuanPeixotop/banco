package br.com.aps.banco;

import Exceptions.ContaException;
import Exceptions.MovimentacaoException;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao;
    
    public ContaCorrente(long numeroConta, double saldo, double taxa) {
        super(numeroConta, saldo);
        this.taxaDeOperacao =  taxa;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor + taxaDeOperacao <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - (valor + taxaDeOperacao));
            } else {
                throw new MovimentacaoException("Saldo Insuficiente");
            }
        } else {
            throw new MovimentacaoException("Valor inválido!");
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
        System.out.println(this.getTaxaDeOperacao());
    }
    
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
}
