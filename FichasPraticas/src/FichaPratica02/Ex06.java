package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler num1
        System.out.print("Insira 1º número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira 2º número: ");
        num2 = input.nextInt();

        // Imprimir o maior dos dois
        if (num1 > num2) {
            // Aqui dentro, o número 1 é o maior
            System.out.println(num1 + " " + num2);
        } else {
            // Aqui dentro, o número 2 é o maior
            System.out.println(num2 + " " + num1);
        }

    }
}
