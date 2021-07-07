package br.ufrpe.bcc.ip2.projeto.model;

import java.util.Date;

public class Jogador extends Pessoa {
    private int habilidade; //Varia de 1 a 200;
    private Clube time;
    private float valor;
    private float salario;
    private int moral; //Varia de 1 a 5
    private int stamina; //Varia de 1 a 100;
    private boolean machucado;
    private boolean pendurado;
    private int GK; //Capacidade de ser goleiro - varia de 1 a 20
    private int DF; //Capacidade para jogar na zaga - varia de 1 a 20
    private int MF; //Capacidade para jogar no meio-campo - varia de 1 a 20
    private int ATK; //Capacidade para jogar no ataque - varia de 1 a 20

    //Construtor da superclasse
    protected Jogador(String nome, int idade, String nacionalidade,
                      int habilidade, Clube time, boolean machucado, boolean pendurado,
                      int gk, int df, int mf, int atk) {

        super(nome, idade, nacionalidade);

        this.habilidade = habilidade;
        this.time = time;
        this.pendurado = false;
        this.machucado = machucado;
        this.GK = gk;
        this.DF = df;
        this.MF = mf;
        this.ATK = atk;

    }

    //Getters e Setters
    public float getValor() {
        return valor;
    }

    //Precisa ser privado, pois a determinação do valor segue uma fórmula específica
    //Leva em consideração sua qualidade, reputação e a reputação do time em que joga
    private void setValor() {
        //this.valor = valor;
        //Inserir fórmula
    }

    public float getSalario() {
        return salario;
    }

    //Precisa ser privado, pois a determinação do salário segue uma fórmula específica
    //Precisa levar em consideração sua qualidade, sua reputação
    //E a reputação e a qualidade do time em que joga
    private void setSalario() {
        //this.salario = salario;
        //Inserir fórmula
    }

    public int getMoral() {
        return moral;
    }

    //Precisa ser privado, pois a determinação do moral segue uma fórmula específica
    //Leva em consideração o o número de vitórias, empates e derrotas recentes
    //Vitória aumenta em 1
    //Empate não muda
    //Derrota diminue 1
    private void setMoral(int moral) {
        this.moral = moral;
    }

    public int getStamina() {
        return stamina;
    }

    //Precisa ser privado, pois a determinação da stamina segue uma fórmula específica
    //Se não jogar, não diminui
    //Se jogar um jogo completo, diminui 40
    //Se jogar um jogo completo com prorrogação, diminui 50
    //Se jogar só o 1º tempo, diminui 20
    //Cada dia que passa sem jogar, aumenta em 10
    //O máximo é 100
    //
    //Agora, caso consigamos fazer uma contagem do tempo de jogo,
    //Podemos fazer a stamina do jogador cair 1 ponto a cada 2min de jogo
    private void setStamina() {
        this.stamina = stamina;
    }

    public boolean isMachucado() {
        return machucado;
    }

    public void setMachucado(boolean machucado) {
        this.machucado = machucado;
    }

    public boolean isPendurado() {
        return pendurado;
    }

    public void setPendurado(boolean pendurado) {
        this.pendurado = pendurado;
    }

    //Métodos especiais
    public void melhorarMoral(){

    }

    public void piorarMoral(){

    }

    public void aumentarStamina(){

    }

    public void diminuirStamina(){

    }
}