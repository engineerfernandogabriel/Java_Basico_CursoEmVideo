package cursoemvideo.javabasico;

public class SuperCalculadora {

    public static void main(String[] args) {
        float num = 12;
        int div2 = (int) (num % 2); //Resto da divisão por 2
        float pot3 = (float) Math.pow(num,3); //Potência de 3
        float raiz2 = (float) Math.sqrt(num); // Raiz Quadrada
        float raiz3 = (float) Math.cbrt(num); //Raiz Cúbica
        int valorabs = (int) Math.abs(num); // valor absoluto

        System.out.println("Para o número: " + num);
        System.out.println("Resto da Divisão por 2 = " + div2);
        System.out.println("Eleavado ao Cubo = " + pot3);
        System.out.printf("Raiz Quadrada = %.2f%n", raiz2); //Printf é devido a formatação dentro do texto de saída
        System.out.printf("Raiz Cúbica = %.2f%n", raiz3); //Printf é devido a formatação dentro do texto de saída
        System.out.println("Valor Absoluto: " + valorabs);

    }
}
