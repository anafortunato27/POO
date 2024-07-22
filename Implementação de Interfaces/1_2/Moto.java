public class Moto extends Terrestre implements Movel, Licenciado{
    public String cor;
    public String placa;
    public int marcha;
    
    public Moto(String cor, String placa, int marcha){
        super(2);
        this.cor = cor;
        this.placa = placa;
        this.marcha = marcha;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String gePlaca(){
        return placa;
    }
    
    public int getMarcha(){
        return marcha;
    }
    
    public void trocarMarcha(int marcha){
        this.marcha = marcha;
    }
    
    @Override
    public int capacidade(){
        return 15;
    }
    
    @Override
    public int velocidade(){
        return 150;
    }
    
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando!");
    }
    
    @Override
    public void frear(){
        System.out.println("A moto está freando!");
    }
    
    @Override
    public void emplacar(String placa){
        this.placa = placa;
    }
}