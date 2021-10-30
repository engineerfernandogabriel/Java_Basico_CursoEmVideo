package heranca2;

public class Main {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor prof1 = new Professor();

        a1.setNome("Fernando");
        v1.setNome("Graciela");
        b1.setNome("Giovanna");
        prof1.setNome("Marcos Gabriel");

        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(prof1.toString());

        prof1.setSalario(4500);
        System.out.println(prof1.getSalario());
        prof1.receberAumento(1000);
        System.out.println(prof1.getSalario());

        a1.pagarMensalidade();
        b1.pagarMensalidade();


    }
}
