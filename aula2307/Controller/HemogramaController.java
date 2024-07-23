package Controller;

import Model.DatabaseUtil;
import Model.Hemograma;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HemogramaController {

    @FXML
    private TableView<Hemograma> tableView;

    @FXML
    private TableColumn<Hemograma, Integer> idColumn;

    @FXML
    private TableColumn<Hemograma, String> nomeColumn;

    @FXML
    private TextField nomeField;

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nomeColumn.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
    }

    @FXML
    private void listarRegistros() {
        ObservableList<Hemograma> hemogramas = FXCollections.observableArrayList();
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM hemogramas";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                // Obtenha outros campos conforme necessário
                Hemograma hemograma = new Hemograma(id, nome);
                hemogramas.add(hemograma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tableView.setItems(hemogramas);
    }

    @FXML
    private void adicionarRegistro() {
        String nome = nomeField.getText();
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO hemogramas (nome) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nome);
            // Defina outros parâmetros conforme necessário
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        listarRegistros();
    }
}
