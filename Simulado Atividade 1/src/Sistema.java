public class Sistema {
    public void run(){
        Usuarios usuarios01 = new Usuarios("Joao", "batatinha99", "jpsocio45@gmail.com");
        Usuarios usuarios02 = new Usuarios("Roberto", "pokemonéruim123","roberto@maua.br");
        Conta conta01 = new Conta(1,1000);
        Conta conta02 = new Conta(2,250);
        System.out.println(usuarios01);
        System.out.println(conta01);
        System.out.println(usuarios02);
        System.out.println(conta02);
        

    }
}
