package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int lugarCorrida;

        // Ler corrida
        System.out.print("Introduza o seu lugar na corrida: ");
        lugarCorrida = input.nextInt();

        if (lugarCorrida == 1) {
            System.out.println("Ganhou 10 pontos");
        }

        if (lugarCorrida == 2) {
            System.out.println("Ganhou 8 pontos");
        }

        if (lugarCorrida == 3) {
            System.out.println("Ganhou 6 pontos");
        }

        if (lugarCorrida == 4) {
            System.out.println("Ganhou 5 pontos");
        }

        if (lugarCorrida == 5) {
            System.out.println("Ganhou 4 pontos");
        }

        if (lugarCorrida == 6) {
            System.out.println("Ganhou 3 pontos");
        }

        if (lugarCorrida == 7) {
            System.out.println("Ganhou 2 pontos");
        }

        if (lugarCorrida == 8) {
            System.out.println("Ganhou 1 ponto");
        }

        if (lugarCorrida >= 9) {
            System.out.println("Não ganhou nenhum ponto.");
        }

    }
}
