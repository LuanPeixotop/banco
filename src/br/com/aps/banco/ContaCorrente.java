package br.com.aps.banco;

public class ContaCorrente extends ContaBancaria implements Imprimivel{

    private double taxaDeOperacao;
    
    @Override
    public void sacar(double valor) {
        if (valor + taxaDeOperacao <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - (valor + taxaDeOperacao));
            System.out.println("Valor sacado com sucesso!");
        } else {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
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
