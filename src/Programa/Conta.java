package Programa;

import utilitarios.Utils;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(int numeroConta, Pessoa pessoa, Double saldo) {
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "\nNumero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getName() +
                "\nCPF: " + this.pessoa.getName() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

}
