package br.com.aps.banco;

public abstract class ContaBancaria implements Imprimivel {
    private long numeroConta;
    private double saldo;
    
    public abstract void sacar (double valor);
    public abstract void depositar (double valor);
    
    public ContaBancaria(long numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void transferir (double valor, ContaBancaria contaDe, ContaBancaria contaPara) {
        contaDe.sacar(valor);
        contaPara.depositar(valor);
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
