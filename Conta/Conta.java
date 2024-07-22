
/**
 * Questão 1 da Atividade 2
 *
 * @Ana Fortunato
 * @11/06/2024
 */

public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
