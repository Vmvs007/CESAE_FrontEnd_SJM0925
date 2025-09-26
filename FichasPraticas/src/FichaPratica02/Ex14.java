package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int a, b, c;

        // Ler números
        System.out.print("Insira o 1º número: ");
        a = input.nextInt();

        System.out.print("Insira o 2º número: ");
        b = input.nextInt();

        System.out.print("Insira o 3º número: ");
        c = input.nextInt();

        if (a < b && a < c) { // a ... ...

            if (b < c) { // a b c
                System.out.println(a + " " + b + " " + c);
            } else { // a c b
                System.out.println(a + " " + c + " " + a);
            }
        }

        if (b < a && b < c) { // b ... ...

            if (a < c) { // b a c
                System.out.println(b + " " + a + " " + c);
            } else { // b c a
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c < a && c < b) { // c ... ...

            if (a < b) { //c a b
                System.out.println(c + " " + a + " " + b);

            } else { // c b a
                System.out.println(c + " " + b + " " + a);

            }
        }
    }
}
