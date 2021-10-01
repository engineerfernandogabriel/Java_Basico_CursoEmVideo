package cursoemvideo.javabasico;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de 'a' na equação: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o valo de 'b' na equcação: ");
        float n2 = teclado.nextFloat();
        System.out.println("Digite o valor de 'c' na equação: ");
        float n3 = teclado.nextFloat();

        float delta = (float) Math.pow(n2,2) - (4 * n1 * n3);

        System.out.println("O valor de Delta é: " + delta);

        if (delta >= 0){
            System.out.println("Existem raízes reais");
        } else {
            System.out.println("Não existem raízes reais");
        }

        float x1 = (float) ((-n2) + (Math.sqrt(delta))) / (2 * n1);
        float x2 = (float) ((-n2) - (Math.sqrt(delta))) / (2 * n1);

        System.out.println("x' = " + x1);
        System.out.println("x'' = " + x2);

    }

}
