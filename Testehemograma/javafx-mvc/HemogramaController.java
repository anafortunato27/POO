/**
 * Calcula as Plaquetas e a Hemoglobina Corpuscular Média (HCM)
 * 
 * @author anafortunato27
 * @version 04/06/2024
 */

public class HemogramaController {
    private HemogramaModel model;
    private HemogramaView view;

    public HemogramaController(HemogramaModel model, HemogramaView view) {
        this.model = model;
        this.view = view;
    }

    public void calcularIndices() {
        double hcm = model.calcularHCM();

        view.exibirResultados(hcm);
    }
}
