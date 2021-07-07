package br.ufrpe.bcc.ip2.projeto.persistencia;

import br.ufrpe.bcc.ip2.projeto.model.Clube;
import br.ufrpe.bcc.ip2.projeto.model.Jogador;
import br.ufrpe.bcc.ip2.projeto.model.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class ClubeDAO {

    private List<Clube> repositorio = new ArrayList<>();

    /*public ClubeDAO(){

        //List<String> linhas = Arquivos.lerArquivo("C:\\Users\\Paulo\\IdeaProjects\\projeto-2va-football-club-manager\\times.csv");
    }*/

    public void criarTimes(String nome, String nacionalidade, Tecnico tecnico, ArrayList<Jogador> jogadores,
                           double caixa, int reputacao){
        //repositorio.add("Chelsea");
        repositorio.add(new Clube(nome, nacionalidade, tecnico, jogadores, caixa, reputacao));
       // repositorio.add("Man City");
        //repositorio.add("Man Utd");
        //repositorio.add("Tottenham");
        //repositorio.add("Liverpool");
        repositorio.add("Arsenal");
    }

}