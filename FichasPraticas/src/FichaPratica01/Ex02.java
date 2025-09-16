package FichaPratica01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        // Ler num1
        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();


        // Calcular a soma
        soma = num1 + num2;

        // Apresenta a soma
        System.out.println("\nSoma: " + soma);


        // Calcular a subtracao
        subtracao = num1 - num2;

        // Apresenta a subtracao
        System.out.println("Subtração: " + subtracao);


        // Calcular a multiplicacao
        multiplicacao = num1 * num2;

        // Apresenta a multiplicacao
        System.out.println("Multiplicação: " + multiplicacao);


        // Calcular a divisao
        divisao = num1 / num2;

        // Apresenta a divisao
        System.out.println("Divisão: " + divisao);
    }
}
