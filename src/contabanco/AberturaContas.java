package contabanco;

public class AberturaContas {
    public static void main(String[] args){
        ContaBanco f1 = new ContaBanco();
        f1.setNumConta(74023);
        f1.setDono("Fernando Gabriel");
        f1.abrirConta("CC");

        ContaBanco f2 = new ContaBanco();
        f2.setNumConta(231011);
        f2.setDono("Graciela");
        f2.abrirConta("CP");

        f1.depositar(350d);
        f2.depositar(200d);
        f2.sacar(200d);

        f1.estadoAtual();
        f2.estadoAtual();


    }

}
