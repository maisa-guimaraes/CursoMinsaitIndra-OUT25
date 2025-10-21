public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(int idPessoa, String nomePessoa, String enderecoPessoa, String telefonePessoa, String cnpj) {
        super(idPessoa, nomePessoa, enderecoPessoa, telefonePessoa);
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return this.cnpj;
    }

    @Override
    public void setDocumento(String documento) {
        this.cnpj = documento;
    }

    @Override
    public String toString() {

        String dados = super.toString();

        return dados.substring(0, dados.length() - 1) +
                ", documentoPolimorfico='" + getDocumento() + '\'' +
                '}';
    }


}