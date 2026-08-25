package br.edu.unipe.apsii;

public class Banco {
    private String nome;
    private String cpf;
    private double saldo;

    public Banco() {
        this.nome = "Sem nome";
        this.cpf = "Sem cpf";
        this.saldo = 0;
    }

    public Banco(String novoNome, String novoCpf, double novoSaldo) {
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.saldo = novoSaldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

}
