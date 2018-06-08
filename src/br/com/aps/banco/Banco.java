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
        Relatorio relatorio = new Relatorio();
        for(ContaBancaria conta : contas) {
            relatorio.gerarRelatorio((Imprimivel) conta);
        }
    }
    
    public ArrayList retornaNumeroContas() {
        ArrayList<String> numeroContas = new ArrayList<String>();
        if (contas != null) {
            contas.forEach(conta -> {
                numeroContas.add(Long.toString(conta.getNumeroConta()));
            });
        } 
        return numeroContas;
    }
    
    public ArrayList<ContaBancaria> retornaContas() {
        return contas;
    }

    @Override
    public String retornarDados() {
        String relatorio = "";
        for (ContaBancaria conta : contas) {
            relatorio = relatorio + conta.retornarDados();
        }
        return relatorio;
    }
}
