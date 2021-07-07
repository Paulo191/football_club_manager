package controller;

import br.ufrpe.bcc.ip2.projeto.model.Tecnico;
import br.ufrpe.bcc.ip2.projeto.persistencia.ClubeDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Teste extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Para consertar o erro de LOCAL NÃO ENCONTRADO usamos o getClassLoader
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/TabelaLiga.fxml"));
        primaryStage.setTitle("Football Club Manager");
        primaryStage.setScene(new Scene(root, 700, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {

        Tecnico t = new Tecnico("Paulo Sérgio",
                28, "Brasil", 20);

        ClubeDAO c = ClubeDAO.getInstance(); //Criação do repositório c
        //c já é o repositório todo

        c.criarTimes("Chelsea", "Inglaterra", t,
                150000000, 8700);

        c.criarTimes("Man City", "Inglaterra", t,
                150000000, 8700);

        c.criarTimes("Man Utd", "Inglaterra", t,
                150000000, 8700);

        c.criarTimes("Arsenal", "Inglaterra", t,
                150000000, 8700);

        c.criarTimes("Liverpool", "Inglaterra", t,
                150000000, 8700);

        c.criarTimes("Tottenham", "Inglaterra", t,
                150000000, 8700);

        launch(args);
    }
}