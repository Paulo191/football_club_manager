package br.ufrpe.bcc.ip2.projeto.Jogo;

import br.ufrpe.bcc.ip2.projeto.model.Clube;

import java.util.Date;

public abstract class Campeonato {
    private Date dataInicio;
    private Date dataFim;
    protected Clube[] times;

    //Construtor
    public Campeonato(Date dataInicio, Date dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}