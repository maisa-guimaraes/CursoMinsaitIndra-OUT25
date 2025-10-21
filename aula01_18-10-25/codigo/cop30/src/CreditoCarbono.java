import java.util.Calendar;

public class CreditoCarbono {

    private int idCreditoCarbono;
    private Calendar dataProducao;
    private String localizacaoCreditoCarbono;

    public CreditoCarbono() {
    }

    public CreditoCarbono(int idCreditoCarbono, Calendar dataProducao, String localizacaoCreditoCarbono) {
        this.idCreditoCarbono = idCreditoCarbono;
        this.dataProducao = dataProducao;
        this.localizacaoCreditoCarbono = localizacaoCreditoCarbono;
    }

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

    @Override
    public String toString() {

        return "CreditoCarbono{" +
                "idCreditoCarbono=" + idCreditoCarbono +
                ", dataProducao=" + dataProducao.getTime() +
                ", localizacaoCreditoCarbono='" + localizacaoCreditoCarbono + '\'' + '}';
    }

}

