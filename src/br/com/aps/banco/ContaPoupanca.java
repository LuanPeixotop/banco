package br.com.aps.banco;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    
    private double limite;

    @Override
    public void sacar(double valor) {
        if (valor <= (this.getSaldo() + limite)) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Valor sacado com sucesso!");
        } else {
            throw new IllegalArgumentException("Saldo e limite Insuficientes");
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
