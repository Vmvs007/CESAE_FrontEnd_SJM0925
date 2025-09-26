package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int opcao;

        // Apresentar as opções
        System.out.println("***** MENU *****");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        // Ler opção
        System.out.print("Selecione uma opção: ");
        opcao= input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\n***** CRIAR *****");
                break;

            case 2:
                System.out.println("\n***** ATUALIZAR *****");
                break;

            case 3:
                System.out.println("\n***** ELIMINAR *****");
                break;

            case 4:
                break;

            default:
                System.out.println("\n***** OPÇÃO NÃO RECONHECIDA *****");
                break;
        }

    }
}
