package contabanco;

public class ContaBanco {

    //Atributos
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;


    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

    //Métodos Especiais: Construtores, Getters e Setters
    public ContaBanco(){
        this.setSaldo(0.0);
        this.setStatus(false);
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //Métodos
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(this.getTipo().equalsIgnoreCase("CC")){
            this.setSaldo(50d);
        }else if(this.getTipo().equalsIgnoreCase("CP")){
            this.setSaldo(150d);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda possue saldo");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não ode ser fechada pois possue débitos");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada");
        }
    }

    public void depositar(Double v){
        if(this.getStatus()){                               //Verificar se é uma conta aberta/válida
            this.setSaldo(this.getSaldo() + v) ;            //this.saldo = this.saldo + v
            System.out.println("Depósito realizado ");
        }else{
            System.out.println("Conta não localizada");
        }

    }

    public void sacar(Double v){
        if(this.getStatus()){                                //Verificar se é uma conta aberta/válida
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$ " + v + " realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Conta não localizada");
        }

    }

    public void pagarMensal(){
        Double v = 0d;

        if(this.getTipo().equalsIgnoreCase("CC")){
            v = 12.00;
        }else if(this.getTipo().equalsIgnoreCase("CP")){
            v = 20.00;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("Conta não localizada");
        }

    }

}