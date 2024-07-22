public class Aquatico extends Transporte {
    public String tipo;
    
    public Aquatico(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public int capacidade(){
        return 58;
    }
    
    @Override
    public int velocidade(){
        return 43;
    }
}
