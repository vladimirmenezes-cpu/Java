package aula11;

public abstract class Funcionarios implements Pagamento {

    private String nome;
    private String cpf;

        public Funcionarios(String nome, String cpf){
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }

        public String exibirDados(){
            return "nome:" + nome + "\nCPF:" + cpf;
        }

        @Override 
        public double calcularPagamento(double bonus) {
            return calcularPagamento() + bonus;
        }
}
