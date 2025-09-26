package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {

        // Declarar as variáveis
        int numero = 1, soma = 0;

        while (numero <= 100) {
            System.out.println(numero);
            soma = soma + numero;
            numero++; // numero = numero + 1;
        }

        System.out.println("Somatório: " + soma);
    }
}
