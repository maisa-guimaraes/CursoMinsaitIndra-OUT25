public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(int idPessoa, String nomePessoa, String enderecoPessoa, String telefonePessoa, String cpf) {
        super(idPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return this.cpf;
    }

    @Override
    public void setDocumento(String documento) {
        this.cpf = documento;
    }

    @Override
    public String toString() {

        String dados = super.toString();

          return dados.substring(0, dados.length() - 1) +
                ", documentoPolimorfico='" + getDocumento() + '\'' +
                '}';
    }

}

