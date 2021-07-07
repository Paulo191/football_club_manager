package br.ufrpe.bcc.ip2.projeto.Jogo;

import br.ufrpe.bcc.ip2.projeto.model.Clube;

import java.util.Date;

public class PremierLeague extends Campeonato {

    public PremierLeague(Date dataInicio, Date dataFim, Clube[] times) {
        super(dataInicio, dataFim);

        this.times = new Clube[20]; //Pois são 20 times
    }
}