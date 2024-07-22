public class Carro extends Terrestre implements Movel, Licenciado{
    public String cor;
    public String placa;
    public int marcha;
    
    public Carro(String cor, String placa, int marcha){
        super(4);
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
        return 40;
    }
    
    @Override
    public int velocidade(){
        return 200;
    }
    
    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando!");
    }
    
    @Override
    public void frear(){
        System.out.println("O carro está freando!");
    }
    
    @Override
    public void emplacar(String placa){
        this.placa = placa;
    }
}