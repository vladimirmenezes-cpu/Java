package aula09;

public class ContatoProfissional extends Contato {
    private String cargo;
    private String empresa;

    public ContatoProfissional(String nome, String numero, String cargo, String empresa) {
        super(nome, numero);
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String exibirDados() {
        String dados = super.exibirDados();
        return dados + " | Tipo: Profissional" + " | Empresa: " + empresa + " | Cargo: " + cargo;
    }
}