package br.com.aps.banco;

import Exceptions.ContaException;
import java.util.ArrayList;

public class Banco implements Imprimivel {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    
    public void inserir(ContaBancaria objeto) throws ContaException {
        boolean cadastrada = false;
        for(ContaBancaria conta : contas) {
           if (objeto.getNumeroConta() == conta.getNumeroConta()) {
               cadastrada = true;
               throw new ContaException("Conta já cadastrada!");
           }
        }
        if (!cadastrada) {
            contas.add(objeto);
        }
    }
    
    public void remover(ContaBancaria objeto) throws ContaException {
        ContaBancaria conta = procurarConta(objeto.getNumeroConta());
        if (conta != null) {
            contas.remove(conta);
        } else {
            throw new ContaException("Conta não existente no banco!");
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
