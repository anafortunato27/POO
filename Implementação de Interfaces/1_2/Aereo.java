public class Aereo extends Transporte {
    public String tipoMotor;
    
    public Aereo(String tipo) {
        this.tipoMotor = tipoMotor;
    }
    
    public String getTipoMotor(){
        return tipoMotor;
    }
    
    @Override
    public int capacidade(){
        return 150;
    }
    
    @Override
    public int velocidade(){
        return 1000;
    }
}