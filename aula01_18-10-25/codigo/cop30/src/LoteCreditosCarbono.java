import java.util.Set;

public class LoteCreditosCarbono {

    private int idLoteCreditosCarbono;
    private Set<Integer> idsCreditosCarbono;
    private Set<Integer> idsProprietarios;
    private Set<String> historicoLote;

    public LoteCreditosCarbono() {
    }

    public LoteCreditosCarbono(int idLoteCreditosCarbono, Set<Integer> idsCreditosCarbono, Set<Integer> idsProprietarios, Set<String> historicoLote) {
        this.idLoteCreditosCarbono = idLoteCreditosCarbono;
        this.idsCreditosCarbono = idsCreditosCarbono;
        this.idsProprietarios = idsProprietarios;
        this.historicoLote = historicoLote;
    }

    public int getIdLoteCreditosCarbono() {
        return idLoteCreditosCarbono;
    }

    public void setIdLoteCreditosCarbono(int idLoteCreditosCarbono) {
        this.idLoteCreditosCarbono = idLoteCreditosCarbono;
    }

    public Set<Integer> getIdsCreditosCarbono() {
        return idsCreditosCarbono;
    }

    public void setIdsCreditosCarbono(Set<Integer> idsCreditosCarbono) {
        this.idsCreditosCarbono = idsCreditosCarbono;
    }

    public Set<Integer> getIdsProprietarios() {
        return idsProprietarios;
    }

    public void setIdsProprietarios(Set<Integer> idsProprietarios) {
        this.idsProprietarios = idsProprietarios;
    }

    public Set<String> getHistoricoLote() {
        return historicoLote;
    }

    public void setHistoricoLote(Set<String> historicoLote) {
        this.historicoLote = historicoLote;
    }

    @Override
    public String toString() {
        return "LoteCreditosCarbono{" +
                "idLoteCreditosCarbono=" + idLoteCreditosCarbono +
                ", idsCreditosCarbono=" + idsCreditosCarbono +
                ", idsProprietarios=" + idsProprietarios +
                ", historicoLote=" + historicoLote +
                '}';
    }

}
