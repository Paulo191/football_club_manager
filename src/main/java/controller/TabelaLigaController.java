package controller;

import br.ufrpe.bcc.ip2.projeto.model.Clube;
import br.ufrpe.bcc.ip2.projeto.persistencia.ClubeDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TabelaLigaController implements Initializable {

    ClubeDAO timesDAO = ClubeDAO.getInstance();

    @FXML
    private TableView<Clube> tabela;
    @FXML
    private TableColumn<Clube, Integer> posicao;
    @FXML
    private TableColumn<Clube, String> nomeTime;
    @FXML
    private TableColumn<Clube, Integer> pontos;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    public ObservableList<Clube> lista;

    public void atualizarTable(){
        tabela.setItems(FXCollections.observableList(timesDAO.findAll()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Os nomes entre parêntesis precisam ser iguais aos nomes das variáveis
        posicao.setCellValueFactory(new PropertyValueFactory<Clube, Integer>("posicao"));
        nomeTime.setCellValueFactory(new PropertyValueFactory<Clube, String>("nome"));
        pontos.setCellValueFactory(new PropertyValueFactory<Clube, Integer>("pontosLiga"));
        atualizarTable(); //Atualiza tabela
    }
}