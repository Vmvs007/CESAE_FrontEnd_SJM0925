package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double valor1, valor2, valor3, mediaAritmetica, mediaPonderada;

        // Ler valores
        System.out.print("Insira o valor 1: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o valor 2: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o valor 3: ");
        valor3 = input.nextDouble();

        // Media Aritmetica
        mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Media Ponderada - valor1 * 20%  +  valor2 * 30%  +  valor3 * 50%
        mediaPonderada = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);
        System.out.println("Média Ponderada: " + mediaPonderada);

    }
}
