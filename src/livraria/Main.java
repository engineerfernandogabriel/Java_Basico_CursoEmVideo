package livraria;

public class Main {
    public static void main(String[] args){
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Fernando", "M", 36);
        p[1] = new Pessoa("Graciela", "F", 39);

        l[0] = new Livro("Aprendnendo java" , "José da Silva", 300, p[0]);
        l[1] = new Livro("P00 para Iniciantes", "Pedro Paulo", 50, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
