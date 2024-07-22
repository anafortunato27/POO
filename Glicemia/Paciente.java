/**
 * 
 * @Ana Fortunato 
 * @11/06/2024
 */

public abstract class Paciente {
    private String nome;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void checarGlicemia(double glicemia);
}
