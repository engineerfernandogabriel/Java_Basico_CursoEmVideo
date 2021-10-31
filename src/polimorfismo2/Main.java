package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        mamifero.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();
        cachorro.reagir(true);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
