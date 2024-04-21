
package br.edu.uniaeso;

import java.io.Serializable;

public class ContaBancaria implements Serializable {
    private String nome;
    private double saldo;
    private int numeroConta;

    @Override
    public String toString() {
        return "ContaBancaria [Nome = " + nome + ", saldo = " + saldo + ", numero da conta = " + numeroConta + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}
