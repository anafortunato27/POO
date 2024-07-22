/**
 * 
 * @Ana Fortunato 
 * @11/06/2024
 */

import java.util.Scanner;

public class ChecarGlicemia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Paciente pai = new Pai("João");
        Paciente mae = new Mae("Clara");

        try {
                System.out.println("Informe o nível de glicemia do pai em jejum (mg/dL) ou digite 'sair' para encerrar: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("sair")) {
                    continuar = false;
                    System.out.println("Programa encerrado.");
                } else {
                    double glicemia = Double.parseDouble(input);

                    if (glicemia < 0) {
                        System.out.println("Valor inválido. A glicemia deve ser um valor positivo.");
                    } else {
                        pai.checarGlicemia(glicemia);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido ou 'sair' para encerrar.");
        }
            
        try {
                System.out.println("Informe o nível de glicemia da mãe em jejum (mg/dL) ou digite 'sair' para encerrar: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("sair")) {
                    continuar = false;
                    System.out.println("Programa encerrado.");
                } else {
                    double glicemia = Double.parseDouble(input);

                    if (glicemia < 0) {
                        System.out.println("Valor inválido. A glicemia deve ser um valor positivo.");
                    } else {
                        mae.checarGlicemia(glicemia);
                    }
                }
            } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido ou 'sair' para encerrar.");
        }

        scanner.close();
    }
}
