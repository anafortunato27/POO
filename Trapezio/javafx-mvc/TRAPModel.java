
/**
 * Modela o cálculo da Área do Trapézio
 * 
 * @author anafortunato27
 * @version 06/05/2024
 */
public class TRAPModel
{
    double area;
    double baseMaior;
    double baseMenor;
    double altura;
    
    public TRAPModel() {
        this.area = 0;
        this.baseMaior = 0;
        this.baseMenor = 0;
        this.altura = 0;
    }
    
    /**
     * Construtor para objetos da classe AreaTrapezio
     */
    public TRAPModel(double area, double baseMaior, double baseMenor, double altura)
    {
        this.area = area;
        this.baseMaior = baseMaior; 
        this.baseMenor = baseMenor; 
        this.altura = altura;
    }

    /**
     * Calcula a Área do Trapézio
     * 
     * @return     o valor da área do trapézio, dada por: (( baseMaior + baseMenor ) * altura) / 2
     */
    public double calcular()
    {
        this.area = (( this.baseMaior + this.baseMenor ) * this.altura) / 2;
        return area;
    }
    
    /**
     * Interpreta o cálculo da área do trapézio
     * 
     * @return     Interpreta o cálculo da área do trapézio
     * @see <a href="https://pt.wikipedia.org/wiki/Trap%C3%A9zio_(geometria)">Trapézio Wikipedia</a>
     */
    public String interpretar()
    {
        String resultado = "";
        double areaTrapezio = this.calcular();
        if(area > 0){
            System.out.println("A área do trapézio é: " + area);;
        } else {
            System.out.println("A área do trapézio é: " + resultado);
        }
        
        return resultado;
    }
}
