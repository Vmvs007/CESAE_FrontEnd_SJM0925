package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, soma;

        // Ler o número 1
        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        // Ler número 2
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1 + num2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

    }
}