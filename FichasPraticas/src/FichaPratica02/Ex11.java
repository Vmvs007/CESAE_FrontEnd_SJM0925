package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double saldo, movimento, saldoAposMovimento;

        // Ler saldo
        System.out.print("Saldo Atual: ");
        saldo = input.nextDouble();

        // Ler movimento
        System.out.print("Valor a Movimentar: ");
        movimento = input.nextDouble();

        saldoAposMovimento = saldo + movimento;

        if (saldoAposMovimento >= 0) {
            // Quer dizer que aplicando este movimento, o saldo mantem-se positivo

            // TRANSAÇÃO VÁLIDA
            System.out.println("Transação efetuada");
            saldo = saldoAposMovimento;
        } else {
            // TRANSAÇÃO INVÁLIDA
            System.out.println("Operação inválida. Saldo insuficiente");
        }


        System.out.println("Saldo Atual: " + saldo);
    }
}
