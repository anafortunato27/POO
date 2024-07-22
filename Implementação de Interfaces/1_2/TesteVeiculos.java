
public class TesteVeiculos{
    public static void main(String[] args){
        Movel[] veiculos = new Movel[3];
        Voador[] voadores = new Voador[1];
        
        veiculos[0] = new Barco("Navio", true);
        veiculos[1] = new Moto("Preta", "LNM-1477", 2);
        veiculos[2] = new Carro("Cinza", "LVG-4275", 5);
        voadores[0] = new Aviao("Helicóptero", true);
        
        for(Movel veiculo : veiculos){
            veiculo.acelerar();
            veiculo.frear();
        }
        
        for(Voador voador : voadores){
            voador.voar(6.4);
        }
    }
}
