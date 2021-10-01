package cursoemvideo.javabasico;

import java.util.Scanner;

public class FatorialWhile {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        long num, f, r;
        System.out.println("Digite o número para saber o seu fatorial: ");
        num = teclado.nextInt();
        r = num;
        f = r;

        while (r > 1){
            f = (f * (r-1));
            r--;
        }

        System.out.println("O fatorial de " + num + " é " + f);

    }

}
