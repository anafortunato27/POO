/**
    Classe: Estudante
    Atributos: nota1, nota2, media, frequencia
    Métodos: 
      - boolean reprovado_por_frequencia()
      - boolean reprovado_por_media()
      - boolean aprovado()
**/

public class Estudante
{
    double nota1, nota2, media, frequencia;
    
    public Estudante(double nota1, double nota2, double frequencia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        calculoMedia();
        this.frequencia = frequencia;
    }
    
    public boolean reprovado_por_frequencia() {
        return frequencia < 75;
    }
    
    public void calculoMedia(){
        media = (nota1 + nota2) / 2;
    }
    
    public boolean reprovado_por_media() {
        return media < 6;
    }
    
    public boolean aprovado() {
        if(!reprovado_por_frequencia() && !reprovado_por_media()){
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimirDados() {
        System.out.println("Média: " + media + "\n");
        System.out.println("Frequência: " + frequencia + "\n");
    }
    
    public static void main (String[] args){
        //Criando um estudante
        Estudante estudante = new Estudante(5.6, 5, 78);
        
        estudante.imprimirDados();
        
        if(estudante.aprovado()){
            System.out.println("\nParabéns!! Estudante aprovado \n");
        }else{
            System.out.println("\nEstudante reprovado, tente novamente \n");
        }
    }
}
