import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author Ana Fortunato 
 * @version 06/05/2024
 */
public class TRAPController
{
    TRAPView trapView;
    Stage stage;
    TRAPModel trapModel;
    public TextField textFieldAltura;
    public TextField textFieldBaseMaior;
    public TextField textFieldBaseMenor;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe TRAPController
     */
    public TRAPController()
    {
        this.stage = new Stage();
        this.trapModel = new TRAPModel();
        this.trapView = new TRAPView();
        this.trapView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.trapView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double baseMaior = Double.parseDouble(textFieldBaseMaior.getText());
            double baseMenor = Double.parseDouble(textFieldBaseMenor.getText());
            this.labelResultado.setText(trapModel.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldBaseMaior.setText("");
        textFieldBaseMenor.setText("");
        labelResultado.setText("");
    }    
}
