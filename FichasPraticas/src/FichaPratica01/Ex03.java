package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int comprimento, largura, perimetro, area;

        // Ler comprimento
        System.out.print("Insira o comprimento (m.): ");
        comprimento = input.nextInt();

        // Ler largura
        System.out.print("Insira a largura (m.): ");
        largura = input.nextInt();

        // Calcular e apresentar o perimetro
        perimetro = comprimento + comprimento + largura + largura;
        System.out.println("Perímetro: " + perimetro + " m.");

        // Calcular e apresentar a área
        area = comprimento * largura;
        System.out.println("Área: " + area + " m2.");

    }
}
