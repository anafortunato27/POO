package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import Model.DatabaseUtil;
import Model.Hemograma;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AppController implements Initializable {
    @FXML
    private TableView<Hemograma> tabela;
    @FXML
    private TableColumn<Hemograma, Boolean> selectCol;
    @FXML
    private TableColumn<Hemograma, String> pacienteCol;
    @FXML
    private TableColumn<Hemograma, Integer> idadeCol;
    @FXML
    private TableColumn<Hemograma, Double> hemoglobinaCol;
    @FXML
    private TableColumn<Hemograma, Double> hematocritoCol;
    @FXML
    private TableColumn<Hemograma, Integer> leucocitosCol;
    @FXML
    private TableColumn<Hemograma, Integer> plaquetasCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selectCol.setCellValueFactory(new PropertyValueFactory<>("selected"));
        pacienteCol.setCellValueFactory(new PropertyValueFactory<>("paciente"));
        idadeCol.setCellValueFactory(new PropertyValueFactory<>("idade"));
        hemoglobinaCol.setCellValueFactory(new PropertyValueFactory<>("hemoglobina"));
        hematocritoCol.setCellValueFactory(new PropertyValueFactory<>("hematocrito"));
        leucocitosCol.setCellValueFactory(new PropertyValueFactory<>("leucocitos"));
        plaquetasCol.setCellValueFactory(new PropertyValueFactory<>("plaquetas"));

        selectCol.setCellFactory(CheckBoxTableCell.forTableColumn(selectCol));
        pacienteCol.setCellFactory(TextFieldTableCell.forTableColumn());

        try {
            tabela.setItems(listaDeHemogramas());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ObservableList<Hemograma> listaDeHemogramas() throws SQLException {
        return FXCollections.observableArrayList(
                new Hemograma("Ana", 28, 13.5, 40.2, 7500, 250000),
                new Hemograma("Italo", 19, 14.2, 42.1, 8000, 270000),
                new Hemograma("Eliana", 45, 12.8, 38.0, 7200, 260000),
                new Hemograma("Higor", 33, 13.9, 41.0, 7300, 255000),
                new Hemograma("Talia", 69, 11.5, 36.0, 6900, 240000),
                new Hemograma("Jean", 16, 14.5, 43.0, 8200, 280000)
        );
    }
}
