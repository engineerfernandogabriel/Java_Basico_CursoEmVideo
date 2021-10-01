package cursoemvideo.javabasico;

import java.util.Scanner;

/*
Exemplo de estrutura de repetição com "while"
    Scanner teclado = new Scanner(System.in);
    int num = teclado.nextInt();
    int cc = 0;

    while (cc<=num){
        System.out.println("Contagem " + cc);
        cc++;
    }

 */

public class RepeticaoControle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = teclado.nextInt();

        //for(condição inicial; condição de parada(enquanto); incrementação)
        for (int cc=0; cc<=num; cc++){
            System.out.println("Contagem" + cc);
        }

    }
}
