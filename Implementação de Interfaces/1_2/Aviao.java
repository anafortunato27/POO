public class Aviao extends Aereo implements Voador {
    public boolean comercial;
    
    public Aviao(String tipoMotor, boolean comercial0){
        super(tipoMotor);
        this.comercial = comercial;
    }
    
    public boolean isComercial(){
        return comercial;
    }
    
    @Override
    public void voar(double tempo){
        System.out.println("O Avião está voando por " + tempo + " horas.");
    }
}

