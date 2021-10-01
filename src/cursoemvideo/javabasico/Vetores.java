package cursoemvideo.javabasico;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {

        int numcam[] = {7, 11, 9, 23 , 15, 6, 73, 42};

        System.out.println(Arrays.toString(numcam));

        Arrays.sort(numcam);
        //ordena a lista em ordem crescente

        System.out.println(Arrays.toString(numcam));

        Arrays.fill(numcam,0);
        //altera todos os valores da lista para o parâmetro estabalecido

        System.out.println(Arrays.toString(numcam));

    }

}
