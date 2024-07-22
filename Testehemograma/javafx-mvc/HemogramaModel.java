/**
 * Calcula as Plaquetas e a Hemoglobina Corpuscular Média (HCM)
 * 
 * @author anafortunato27
 * @version 04/06/2024
 */

public class HemogramaModel {
    private double hemoglobina;
    private double eritrócitos;
    private double plaquetas;

    public HemogramaModel(double hemoglobina, double plaquetas) {
        this.hemoglobina = hemoglobina;
        this.eritrócitos = eritrócitos;
        this.plaquetas = plaquetas;
    }

    // Métodos para calcular a Hemoglobina Corpuscular Média (HCM)
    public double calcularHCM() {
        return (hemoglobina * 10) / eritrócitos ;
    }

    // Getters
    public double getHemoglobina() {
        return hemoglobina;
    }

    public double getEritrócitos() {
        return eritrócitos;
    }

    public double getPlaquetas() {
        return plaquetas;
    }
}
