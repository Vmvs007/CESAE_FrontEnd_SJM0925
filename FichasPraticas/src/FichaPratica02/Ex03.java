package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
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
            System.out.println("Imposto 20%: " + imposto);
        }

        if (salario > 15000 && salario <= 20000) {
            // Imposto de 30%
            imposto = salario * 0.3;
            System.out.println("Imposto 30%: " + imposto);
        }

        if (salario > 20000 && salario <= 25000) {
            // Imposto de 35%
            imposto = salario * 0.35;
            System.out.println("Imposto 35%: " + imposto);
        }

        if (salario > 25000) {
            // Imposto de 40%
            imposto = salario * 0.4;
            System.out.println("Imposto 40%: " + imposto);
        }
    }
}
