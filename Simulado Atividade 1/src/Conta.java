
import java.util.HashSet;
public class Conta {
    //Atributos da classe
    private static HashSet<Integer> idConta = new HashSet<>();
    private int idConta;
    private double saldo;

    //Construtor da Classe:

    public Conta(double saldo){
        int novoId = idConta.size()+1;
        idConta.add(novoId);
        this.idConta = idConta;
        this.saldo = saldo;
    }
    
    //Getter
    // Retorna o id da conta
    public int getIdConta(){
        return idConta;
    }
    //Retorna o saldo da conta
    public double getsaldo(){
        return saldo;
    }

//Métodos da classe:
public void visualizarConta(){
    System.out.println("ID da conta:" + idConta);
    System.out.println("Saldo:" + saldo);
}
//Deposita um valor na conta
public void depositar(double valor){
    this.saldo += valor;
}
//Retira o valor do saldo se ele não for maior que o saldo
public boolean sacar(double valor){
    if(valor <= saldo){
        this.saldo -= valor;
        return true;
    }
    return false;
}
//Transfere uma determinada quatiade de dinheiro para outra conta
public boolean transferir(Conta contaDestino, double valor){
    if(valor <= saldo){
        this.saldo -= valor;
        contaDestino.saldo += valor;
        return true;
    }
    return false;
}
//Informacoes da conta
public String toString(){
    return "Contas{"+
    "idConta="+idConta +
    ", saldo="+saldo+
    '}';
}

}
