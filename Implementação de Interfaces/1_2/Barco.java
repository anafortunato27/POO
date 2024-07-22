public class Barco extends Aquatico implements Movel {
    public boolean comercial;
    
    public Barco(String tipo, boolean comercial){
        super(tipo);
        this.comercial = comercial;
    }
    
    public boolean isComercial(){
        return comercial;
    }
    
    @Override
    public void acelerar(){
        System.out.println("O Barco está accelerando");
    }
    
    @Override
    public void frear(){
        System.out.println("O Barco está freando");
    }
    
    @Override
    public int capacidade(){
        return 85;
    }
    
    @Override
    public int velocidade(){
        return 40;
    }
}

