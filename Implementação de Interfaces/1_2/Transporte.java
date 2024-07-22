public abstract class Transporte {
    public abstract int capacidade();
    public abstract int velocidade();
    
    public int getCapacidade(){
        return capacidade();
    }
    
    public int getVelocidade(){
        return velocidade();
    }
}