package cursoemvideo.javabasico;

import java.util.Scanner;

public class VotoObrigacaoOuNao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");

        int anonasc = teclado.nextInt();

        int idade = 2021 - anonasc;

        if (idade >= 18 && idade <= 70){
            System.out.println("Você tem " + idade + " anos, O voto é 'OBRIGATÓRIO'");
        } else if(idade < 16){
            System.out.println("Você tem " + idade + " anos, não pode votar");
        } else if((idade < 18 && idade >= 16) || (idade > 70)){
            System.out.println("Você tem " + idade + " anos, o voto é 'OPCIONAL'");
        }

    }

}