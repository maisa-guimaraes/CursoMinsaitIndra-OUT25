public abstract class Pessoa {

    private int idPessoa;
    private String nomePessoa;
    private String enderecoPessoa;
    private String telefonePessoa;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nomePessoa, String enderecoPessoa, String telefonePessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public abstract String getDocumento();

    public abstract void setDocumento(String documento);

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + this.getIdPessoa() + // Usa getters para acessar atributos herdados
                ", nomePessoa='" + this.getNomePessoa() + '\'' +
                ", enderecoPessoa='" + this.getEnderecoPessoa() + '\'' +
                ", telefonePessoa='" + this.getTelefonePessoa() + '\'' +
                '}';
    }

}
