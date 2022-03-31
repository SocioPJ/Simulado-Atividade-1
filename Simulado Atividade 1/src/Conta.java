public class Conta {
    //Atributos da classe
    private int idConta;
    private double saldo;

    //Construtor:
    public Conta(int idConta,double saldo){
        this.idConta = idConta;
        this.saldo = saldo;
    }
    //Métodos da classe:
    public void visualizarConta(){
        System.out.println("ID da conta:" + idConta);
        System.out.println("Saldo:" + saldo);
    }
    public int getidConta(){
        return idConta;
    }

    public void setNome(int idConta){
        this.idConta = idConta;
    }

    public double getsaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
