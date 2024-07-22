public class Torta
{
    String sabor;
    boolean assada;
    
    public Torta(String sabor){
        this.sabor = sabor;
        this.assada = false;
    }
    
    //Método usado para a montagem da torta
    public void montarTorta(){
        System.out.println("A torta de " + sabor + " está sendo montada... \n");
    }
    
    //Método usado para assar a torta
    public void assarTorta(){
        if(!assada){
            System.out.println("A torta de " + sabor + " está sendo assada... \n");
            assada = true;
            System.out.println("A torta de " + sabor + " já está pronta!!\n");
        }else{
            System.out.println("A torta de " + sabor + " já foi assada.\n");
        }
    }
    
    public static void main(String[] args){
        Torta tortadeMorango = new Torta("morango");
        tortadeMorango.montarTorta();
        tortadeMorango.assarTorta();
        tortadeMorango.assarTorta(); //Para testar se a torta já foi assada
    }
}