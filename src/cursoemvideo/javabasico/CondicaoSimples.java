package cursoemvideo.javabasico;

import java.util.Scanner;

public class CondicaoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;

        System.out.println("Sua média foi " + m);

        if (m >= 7) {
            System.out.println("Parabéns pequeno PADAWAN");
        } else {
            System.out.println("Treine mais padawan");
        }
    }
}
