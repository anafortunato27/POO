public abstract class Terrestre extends Transporte {
    public int numRodas;
    
    public Terrestre(int numRodas){
        this.numRodas = numRodas;
    }
    
    public int getNumRodas(){
        return numRodas;
    }
}