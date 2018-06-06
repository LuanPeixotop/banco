package br.com.aps.banco;

import java.util.ArrayList;

public class Banco implements Imprimivel {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    
    public void inserir(ContaBancaria objeto) {
        boolean cadastrada = false;
        for(ContaBancaria conta : contas) {
           if (objeto.getNumeroConta() == conta.getNumeroConta()) {
               System.out.println("Conta já cadastrada!");
               cadastrada = true;
               break;
           }
        }
        if (!cadastrada) {
            contas.add(objeto);
            System.out.println("Conta cadastrada!");
        }
    }
    
    public void remover(ContaBancaria objeto) {
        ContaBancaria conta = procurarConta(objeto.getNumeroConta());
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta removida!");
        } else {
            System.out.println("Conta não existente no banco!");
        }
    }
    
    public ContaBancaria procurarConta(long numeroConta) {
       for(ContaBancaria conta : contas) {
           if (conta.getNumeroConta() == numeroConta) {
               return conta;
           }
       }
       return null;
    }

    @Override
    public void mostrarDados() {
        contas.forEach(conta -> {
            conta.mostrarDados();
        });
    }
}
