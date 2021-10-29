package heranca;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor prof1 = new Professor();
        Funcionario func1 = new Funcionario();

        p1.setNome("Fernando");
        p1.setSexo("Marculino");
        p1.setIdade(36);
        a1.setNome("Fernanda");
        a1.setSexo("Feminino");
        a1.setIdade(5);
        prof1.setNome("Graciela");
        prof1.setSexo("Feminino");
        prof1.setIdade(39);
        func1.setNome("Giovanna");
        func1.setSexo("Feminino");
        func1.setIdade(4);


        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(prof1.toString());
        System.out.println(func1.toString());

    }

}

