package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int valor1, valor2;

        // Ler valores
        System.out.print("Insira valor 1: ");
        valor1 = input.nextInt();

        System.out.print("Insira valor 2: ");
        valor2 = input.nextInt();

        // Trocar valores
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar valores trocados
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

    }
}
