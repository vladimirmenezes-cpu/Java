public class Conta {
    private final String numero;
    private final String nomeTitular;
    private double saldo;

    public Conta(String numero, String nomeTitular, double saldo){
        validarNumero(numero);
        validarNome(nomeTitular);
        validarSaldo(saldo);
        this.numero = numero.trim();
        this.nomeTitular = nomeTitular.trim();
        this.saldo = saldo;
    }

        private static void validarNumero(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("O número da conta não pode ser vazio.");
        }
    }
 
    private static void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("O nome do titular não pode ser vazio.");
        }
    }
 
    private static void validarSaldo(double saldo) {
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("O saldo inicial não pode ser negativo.");
        }
    }
 
    public String getNumero() {
        return numero;
    }
 
    public String getNomeTitular() {
        return nomeTitular;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    @Override
    public String toString() {
        return String.format("Titular: %s | Conta: %s | Saldo: R$ %.2f", nomeTitular, numero, saldo);
    }
}
