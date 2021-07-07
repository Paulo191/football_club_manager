package br.ufrpe.bcc.ip2.projeto.persistencia;

import br.ufrpe.bcc.ip2.projeto.model.Tecnico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TecnicoDAO {

    private List<Tecnico> repositorio = new ArrayList<>();

    public void criarTecnico(String nome, int idade,
                                    String nacionalidade, int qualidade){
        repositorio.add(new Tecnico(nome, idade, nacionalidade, qualidade));
    }
}