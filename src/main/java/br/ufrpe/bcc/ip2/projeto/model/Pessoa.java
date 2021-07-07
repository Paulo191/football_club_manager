package br.ufrpe.bcc.ip2.projeto.model;

import java.util.Date;

public abstract class Pessoa {
    private final String nome;
    private final Date dataDeNascimento;
    private int idade;
    private String nacionalidade;

    protected Pessoa(String nome, Date dataDeNascimento, int idade, String nacionalidade) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //Métodos especiais
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
}