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
        System.out.println("Tipo da conta: Conta Corrente");
        System.out.println("Numero da Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Taxa de operação: " + this.getTaxaDeOperacao());
    }
    
    public String retornarDados() {
        return "------------------------------------------------------------------\nTipo da conta: Conta Corrente \nNúmero da Conta: " + this.getNumeroConta() + "\nSaldo: " + this.getSaldo() + "\nTaxa de Operação: " + this.getTaxaDeOperacao() + "\n";
    }
    
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
}
