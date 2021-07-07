package br.ufrpe.bcc.ip2.projeto.model;

import java.util.ArrayList;

public class Clube {
    private final String nome;
    private final String nacionalidade;
    private Tecnico tecnico;
    private ArrayList<Jogador> jogadores;
    private double caixa;
    private int reputacao; //Varia de 0 a 10000
    private int pontosLiga = 0;
    private int pontosLigaCampeoes = 0;

    //Construtor


    public Clube(String nome, String nacionalidade, Tecnico tecnico, ArrayList<Jogador> jogadores,
                 double caixa, int reputacao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
        this.caixa = caixa;
        this.reputacao = reputacao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public int getReputacao() {
        return reputacao;
    }

    public int getPontosLiga() {
        return pontosLiga;
    }

    public void setPontosLiga(int pontosLiga) {
        this.pontosLiga = pontosLiga;
    }

    public int getPontosLigaCampeoes() {
        return pontosLigaCampeoes;
    }

    public void setPontosLigaCampeoes(int pontosLigaCampeoes) {
        this.pontosLigaCampeoes = pontosLigaCampeoes;
    }

    //Métodos especiais
    public void contratarTecnico(){

    }

    public void demitirTecnico(){

    }

    @Override
    public String toString(){
        return this.nome;
    }
}