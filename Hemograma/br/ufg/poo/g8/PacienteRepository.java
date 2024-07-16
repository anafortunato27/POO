import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class PacienteRepository {
    private static Database database;
    private static Dao<Paciente, Integer> dao;
    private List<Paciente> loadedPacientes;
    private Paciente loadedPaciente;

    public PacienteRepository(Database database) {
        PacienteRepository.setDatabase(database);
        loadedPacientes = new ArrayList<>();
    }

    public static void setDatabase(Database database) {
        PacienteRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Paciente.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Paciente.class);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Paciente create(Paciente paciente) {
        int nrows = 0;
        try {
            nrows = dao.create(paciente);
            if (nrows == 0) {
                throw new SQLException("Error: object not saved");
            }
            this.loadedPaciente = paciente;
            loadedPacientes.add(paciente);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return paciente;
    }

    public void update(Paciente paciente) {
        try {
            dao.update(paciente);
            // Update the loadedPaciente and loadedPacientes list if necessary
            if (loadedPaciente != null && loadedPaciente.getId() == paciente.getId()) {
                this.loadedPaciente = paciente;
            }
            int index = loadedPacientes.indexOf(paciente);
            if (index != -1) {
                loadedPacientes.set(index, paciente);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(Paciente paciente) {
        try {
            dao.delete(paciente);
            // Remove the paciente from loadedPacientes list if necessary
            if (loadedPaciente != null && loadedPaciente.getId() == paciente.getId()) {
                this.loadedPaciente = null;
            }
            loadedPacientes.remove(paciente);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Paciente loadFromId(int id) {
        try {
            this.loadedPaciente = dao.queryForId(id);
            if (this.loadedPaciente != null) {
                this.loadedPacientes.add(this.loadedPaciente);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedPaciente;
    }

    public List<Paciente> loadAll() {
        try {
            this.loadedPacientes = dao.queryForAll();
            if (this.loadedPacientes.size() != 0) {
                this.loadedPaciente = this.loadedPacientes.get(0);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedPacientes;
    }

    // getters and setters omitted...
}
