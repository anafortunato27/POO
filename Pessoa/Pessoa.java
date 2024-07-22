public class Pessoa
{
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazAniversario() {
        idade ++;
        System.out.println(nome + " fez aniversário e completou " + idade + " anos. \n");
    }
    
    public void imprimirDados() {
        System.out.println("\nDados da pessoa criada: \n");
        System.out.println("Nome: " + nome);
        System.out.println("\nIdade: " + idade);
    }
    
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 19);
        
        //A pessoa irá fazer 5 aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        
        //Imprime a idade e o nome da pessoa
        pessoa.imprimirDados();
    }
}
