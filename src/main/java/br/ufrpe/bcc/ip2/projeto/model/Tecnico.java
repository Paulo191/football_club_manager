package br.ufrpe.bcc.ip2.projeto.model;

import br.ufrpe.bcc.ip2.projeto.model.Pessoa;

import java.util.Date;

public class Tecnico extends Pessoa {
    private int reputacao; //Varia de 1 a 20
    private float salario;
    //Formação preferida???

    public Tecnico(String nome, int idade,
                      String nacionalidade, int reputacao) {
        super(nome, idade, nacionalidade);
        this.reputacao = reputacao;
        //Formação praferida???
    }

    public int getQualidade() {
        return reputacao;
    }

    public void setQualidade(int reputacao) {
        this.reputacao = reputacao;
    }

    public float getSalario() {
        return salario;
    }

    //Precisa ser privado, pois a determinação do salário segue uma fórmula específica
    //Precisa levar em consideração sua qualidade, sua reputação
    //E a reputação e a qualidade do time que treina
    private void setSalario() {
        //this.salario = salario;
        //Inserir fórmula
    }
}