public class Transações {

    //Crie um construtor para a classe Transações que recebe como parâmetro um objeto do tipo Conta.
    public Transações(Conta conta){
        Conta conta01 = new Conta(1,1000);
    }

    //Crie a classe Transações, que deve possuir os seguintes atributos:
    //- Uma lista de transações (ArrayList)
    private class Transacoes {

        private int numero;
        private int valor;
        private String tipo;

        public Transacoes(int numero, int valor, String tipo) {
            this.numero = numero;
            this.valor = valor;
            this.tipo = tipo;
        }

        public int getNumero() {
            return numero;
        }

        public int getValor() {
            return valor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "Transacoes{" + "numero=" + numero + ", valor=" + valor + ", tipo=" + tipo + '}';
        }

    }
    
}