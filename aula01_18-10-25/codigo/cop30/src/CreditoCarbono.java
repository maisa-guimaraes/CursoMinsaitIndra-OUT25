import java.util.Calendar;

public class CreditoCarbono {

    private int idCreditoCarbono;
    private Calendar dataProducao;
    private String localizacaoCreditoCarbono;

    // CONSTRUTOR VAZIO

    public CreditoCarbono() {
    }

    // CONSTRUTOR COM TODOS OS ATRIBUTOS.
 
    public CreditoCarbono(int idCreditoCarbono, Calendar dataProducao, String localizacaoCreditoCarbono) {
        this.idCreditoCarbono = idCreditoCarbono;
        this.dataProducao = dataProducao;
        this.localizacaoCreditoCarbono = localizacaoCreditoCarbono;
    }

    // Obs: imagino localização como coordenadas (latitude e longitude). Seria a maneira mais simples e precisa de especificar, a não ser que esteja em um lugar que tenha um sistema de localização próprio.

    // GETTERS E SETTERS
    
    public int getIdCreditoCarbono() {
        return idCreditoCarbono;
    }

    public void setIdCreditoCarbono(int idCreditoCarbono) {
        this.idCreditoCarbono = idCreditoCarbono;
    }

    public Calendar getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Calendar dataProducao) {
        this.dataProducao = dataProducao;
    }

    public String getLocalizacaoCreditoCarbono() {
        return localizacaoCreditoCarbono;
    }

    public void setLocalizacaoCreditoCarbono(String localizacaoCreditoCarbono) {
        this.localizacaoCreditoCarbono = localizacaoCreditoCarbono;
    }

    // PARA MOSTRAR OS DADOS QUE FORAM INSERIDOS FAZEMOS O OVERRIDE DO TOSTRING
    
    @Override
    public String toString() {

        return "CreditoCarbono{" +
                "idCreditoCarbono=" + idCreditoCarbono +
                ", dataProducao=" + dataProducao.getTime() +
                ", localizacaoCreditoCarbono='" + localizacaoCreditoCarbono + '\'' + '}';
    }

}


