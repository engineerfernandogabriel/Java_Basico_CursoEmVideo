package cursoemvideo.javabasico;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número: ");
    long n1 = teclado.nextLong();
    long poi = n1 % 2;

    if (poi == 0){
        System.out.println("Este número é PAR");
    } else {
        System.out.println("Este número é ÍMPAR");
    }

    }

}
