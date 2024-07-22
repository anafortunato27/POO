
/**
 * Calcula as Plaquetas e a Hemoglobina Corpuscular Média (HCM)
 * 
 * @author anafortunato27
 * @version 04/06/2024
 */

// Main: Main.java
public class Main {
    public static void main(String[] args) {
        HemogramaModel model = new HemogramaModel(13.5, 250000);
        HemogramaView view = new HemogramaView();
        HemogramaController controller = new HemogramaController(model, view);

        controller.calcularIndices();
    }
}
