package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru canguru= new Canguru();
        Cachorro cachorro = new Cachorro();

        m.alimentar();
        r.alimentar();
        p.alimentar();
        a.alimentar();

        m.locomover();
        canguru.locomover();

        canguru.emitirSom();
        cachorro.emitirSom();


    }
}
