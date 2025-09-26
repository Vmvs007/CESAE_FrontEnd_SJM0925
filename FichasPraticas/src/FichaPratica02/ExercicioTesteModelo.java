package FichaPratica02;

public class ExercicioTesteModelo {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;

        a = 10;

        b -= a + 1;

        if (a < b) {
            c = a;
        } else if (a > b) {
            c = b;
        } else if (a == b) {
            c = 15;
        }
    }
}
