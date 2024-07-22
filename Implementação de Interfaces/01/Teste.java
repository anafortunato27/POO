public class Teste
{
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        
        formas[0] = new Retangulo(4.0, 2.0);
        formas[1] = new Circulo(3.5);
        formas[2] = new Quadrado(5.0);
        
        for (FormaGeometrica forma : formas) {
            System.out.println("A area do " + forma.getNomeForma() + "é " + forma.getArea());
            System.out.println("O perimetro do " + forma.getNomeForma() + " é " + forma.getPerimetro());
        }
    }
}
