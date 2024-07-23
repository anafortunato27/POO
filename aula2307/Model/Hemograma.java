package Model;

import javafx.beans.property.*;

public class Hemograma {
    private final IntegerProperty id;
    private final StringProperty nome;
    
    public Hemograma(int id, String nome) {
        this.id = new SimpleIntegerProperty(id);
        this.nome = new SimpleStringProperty(nome);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }
}

