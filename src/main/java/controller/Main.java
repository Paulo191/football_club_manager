package controller;

import br.ufrpe.bcc.ip2.projeto.persistencia.ClubeDAO;
import br.ufrpe.bcc.ip2.projeto.util.Arquivos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
    ClubeDAO cluble = new ClubeDAO();
   // cluble.criarTimes("iwdnqwidn", );
        //Para consertar o erro de LOCAL NÃO ENCONTRADO usamos o getClassLoader
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/TabelaLiga.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);

        Arquivos.lerArquivo("C:/Users/Paulo/IdeaProjects/projeto-2va-football-club-manager/src/main/java/br/ufrpe/bcc/ip2/projeto/persistencia/times.csv");

        /*
        //ESSE BLOCO DE PASSAGEM DO TEMPO É NECESSÁRIO AQUI?
        //DEVE SER NA MAIN?
        //NÃO PODE SER EM OUTRA CLASSE?

        //O jogo se baseará na passagem dos dias
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MMM/yyyy");

        Calendar calendario = new GregorianCalendar();

        //A data inicial do jogo será 01/jul/2018
        calendario.set(2018, 7, 1);

        //Teste para ver se a data especificada está correta
        System.out.println(formatoData.format(calendario.getTime()));

        //Partida partida = new Partida();
        */
    }
}