package Model;

import javafx.beans.property.*;

public class Hemograma {
    private final SimpleBooleanProperty selected;
    private final SimpleStringProperty paciente;
    private final SimpleIntegerProperty idade;
    private final SimpleDoubleProperty hemoglobina;
    private final SimpleDoubleProperty hematocrito;
    private final SimpleIntegerProperty leucocitos;
    private final SimpleIntegerProperty plaquetas;

    public Hemograma(String paciente, Integer idade, Double hemoglobina, Double hematocrito, Integer leucocitos, Integer plaquetas) {
        this.selected = new SimpleBooleanProperty(false);
        this.paciente = new SimpleStringProperty(paciente);
        this.idade = new SimpleIntegerProperty(idade);
        this.hemoglobina = new SimpleDoubleProperty(hemoglobina);
        this.hematocrito = new SimpleDoubleProperty(hematocrito);
        this.leucocitos = new SimpleIntegerProperty(leucocitos);
        this.plaquetas = new SimpleIntegerProperty(plaquetas);
    }

    public boolean isSelected() {
        return selected.get();
    }

    public SimpleBooleanProperty selectedProperty() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected.set(selected);
    }

    public String getPaciente() {
        return paciente.get();
    }

    public SimpleStringProperty pacienteProperty() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente.set(paciente);
    }

    public int getIdade() {
        return idade.get();
    }

    public SimpleIntegerProperty idadeProperty() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade.set(idade);
    }

    public double getHemoglobina() {
        return hemoglobina.get();
    }

    public SimpleDoubleProperty hemoglobinaProperty() {
        return hemoglobina;
    }

    public void setHemoglobina(double hemoglobina) {
        this.hemoglobina.set(hemoglobina);
    }

    public double getHematocrito() {
        return hematocrito.get();
    }

    public SimpleDoubleProperty hematocritoProperty() {
        return hematocrito;
    }

    public void setHematocrito(double hematocrito) {
        this.hematocrito.set(hematocrito);
    }

    public int getLeucocitos() {
        return leucocitos.get();
    }

    public SimpleIntegerProperty leucocitosProperty() {
        return leucocitos;
    }

    public void setLeucocitos(int leucocitos) {
        this.leucocitos.set(leucocitos);
    }

    public int getPlaquetas() {
        return plaquetas.get();
    }

    public SimpleIntegerProperty plaquetasProperty() {
        return plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        this.plaquetas.set(plaquetas);
    }
}
