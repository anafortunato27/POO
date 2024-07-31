package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static List<Hemograma> getHemogramas() throws SQLException {
        List<Hemograma> hemogramas = new ArrayList<>();
        String query = "SELECT paciente, idade, hemoglobina, hematocrito, leucocitos, plaquetas FROM hemogramas";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String paciente = rs.getString("paciente");
                int idade = rs.getInt("idade");
                double hemoglobina = rs.getDouble("hemoglobina");
                double hematocrito = rs.getDouble("hematocrito");
                int leucocitos = rs.getInt("leucocitos");
                int plaquetas = rs.getInt("plaquetas");
                hemogramas.add(new Hemograma(paciente, idade, hemoglobina, hematocrito, leucocitos, plaquetas));
            }
        }
        return hemogramas;
    }

    public static void insertHemograma(Hemograma hemograma) throws SQLException {
        String query = "INSERT INTO hemogramas (paciente, idade, hemoglobina, hematocrito, leucocitos, plaquetas) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, hemograma.getPaciente());
            stmt.setInt(2, hemograma.getIdade());
            stmt.setDouble(3, hemograma.getHemoglobina());
            stmt.setDouble(4, hemograma.getHematocrito());
            stmt.setInt(5, hemograma.getLeucocitos());
            stmt.setInt(6, hemograma.getPlaquetas());
            stmt.executeUpdate();
        }
    }
}
