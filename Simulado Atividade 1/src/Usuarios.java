public class Usuarios{
   
    //Atributos da classe:
    private String nome;
    private String senha;
    private String email;
    private Conta conta;
    }
    //Construtor da classe:
    public Usuarios(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = new Conta(valor);
    }
//Crie métodos para a classe Usuarios:
//-visualizarUsuario()
public void visualizarUsuario(){
    System.out.println("Nome: " + nome);
    System.out.println("Senha: " + senha);
    System.out.println("Email: " + email);
}
    //Métodos da classe:
    public void visualizarUsuario(){
        System.out.println("Nome:" + nome);
        System.out.println("E-mail:" + email);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    
    public String getEmail(){
        return email;
    }
   
    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

}