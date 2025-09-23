package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler numero
        System.out.print("Insira o 1º número: ");
        num1 = input.nextDouble();

        System.out.print("Insira o 2º número: ");
        num2 = input.nextDouble();

        // Ler operacao aritmetica
        System.out.print("Operação pretendida ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {

            case "+": // SOMA
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-": // SUBTRAÇÃO
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*": // MULTIPLICAÇÃO
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/": // DIVISÃO
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default:
                System.out.println("Operação não reconhecida: " + operacao);
                break;
        }

    }
}
