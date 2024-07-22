/**
 * 
 * @Ana Fortunato 
 * @11/06/2024
 */

public class Mae extends Paciente {

    public Mae(String nome) {
        super(nome);
    }

    @Override
    public void checarGlicemia(double glicemia) {
        System.out.println("Mãe " + getNome() + ":");
        if (glicemia < 100) {
            System.out.println("Está com o nível de glicemia normal.");
        } else if (glicemia >= 100 && glicemia <= 125) {
            System.out.println("Está com pré-diabetes. É necessário tratamento para evitar a diabetes.");
        } else if (glicemia >= 126) {
            System.out.println("Está com diabetes.");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
