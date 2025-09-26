package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int inicio = 1, limite, salto = 1;
        String mensagem;

        // Ler limite
        System.out.print("Quantas vezes quer imprimir a mensagem: ");
        limite = input.nextInt();

        // Ler mensagem
        System.out.print("Introduza a mensagem: ");
        input.nextLine(); // Limpeza de buffer
        mensagem=input.nextLine();

        while (inicio <= limite) {
            System.out.println(mensagem);
            inicio = inicio + salto;
        }
    }
}
