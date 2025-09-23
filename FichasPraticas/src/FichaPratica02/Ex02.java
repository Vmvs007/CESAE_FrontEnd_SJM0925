package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double salario, imposto;

        // Ler salario anual
        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            // Imposto de 20%
            imposto = salario * 0.2;
            System.out.println("Imposto de 20%: " + imposto);
        } else {
            // Imposto de 30%
            imposto = salario * 0.3;
            System.out.println("Imposto de 30%: " + imposto);
        }

    }
}
