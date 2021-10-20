package cursoemvideo.javabasico;

import java.util.Scanner;

public class CondicaoTriangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boolean tipo = false ;
        System.out.println("Digite o valor da primeira reta: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite o valor da segunda reta: ");
        int n2 = teclado.nextInt();
        System.out.println("Digite o valor da terceira reta: ");
        int n3 = teclado.nextInt();

        if (((n1 + n2) > n3) && ((n2 + n3) > n1) && ((n1 + n3 > n2))) {
            System.out.println("Estas retas formam um Triângulo");
            tipo = true;
            } else {
            System.out.println("Estas retas NÃO formam um Triângulo");
            }

        if (tipo != true){

        } else if (n1 == n2 && n2 == n3) {
            System.out.println("O triângulo é 'EQUILÁTERO'");
        } else if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("O triângulo é 'ISÓSCELES'");
        } else if ((n1 != n2) && (n2 != n3) && (n3 != n2)) {
            System.out.println("o triângulo é 'ESCALENO'");
        }
    }

}
