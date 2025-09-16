package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double raio, circunferencia, area;

        // Ler raio
        System.out.print("Insira o raio (m.): ");
        raio = input.nextDouble();

        // Calcular e apresentar a circunferencia
        circunferencia = 2 * 3.14 * raio;
        System.out.println("Cricunferência: " + circunferencia + " m.");

        // Calcular e apresentar o raio
        area = 3.14 * raio * raio;
        System.out.println("Área: " + area + " m2.");

    }
}
