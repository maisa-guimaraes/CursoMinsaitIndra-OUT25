import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. TESTE DA PESSOA
        // -------------------------------------------------------------------
        System.out.println("--- Teste de Pessoa e Documentos ---");

        // PESSOA FÍSICA

        PessoaFisica pf = new PessoaFisica(1, "Ana Silva", "Rua A, 10", "9999-0000", "123.456.789-00");

        System.out.println(pf);

        // PESSOA JURÍDICA

        PessoaJuridica pj = new PessoaJuridica(2, "Tech Solucoes Ltda", "Av. Principal, 500", "8888-1111", "00.000.000/0001-00");

        System.out.println(pj);

        // -------------------------------------------------------------------
        // 2. TESTE DA CLASSE CreditoCarbono
        // -------------------------------------------------------------------
        System.out.println("\n--- Teste de CreditoCarbono ---");

        Calendar dataProd = Calendar.getInstance();
        dataProd.set(2025, Calendar.FEBRUARY, 15); // 15/Fev/2025

        CreditoCarbono cc1 = new CreditoCarbono(101, dataProd, "Amazonas, BR");

        cc1.setLocalizacaoCreditoCarbono("Mato Grosso, BR");

        System.out.println(cc1);

        // -------------------------------------------------------------------
        // 3. TESTE DA CLASSE LoteCreditosCarbono
        // -------------------------------------------------------------------
        System.out.println("\n--- Teste de LoteCreditosCarbono ---");

        Set<Integer> creditos = new HashSet<>();
        creditos.add(101);
        creditos.add(102);

        Set<Integer> proprietarios = new HashSet<>();
        proprietarios.add(1);
        proprietarios.add(2);

        LoteCreditosCarbono lote1 = new LoteCreditosCarbono();
        lote1.setIdLoteCreditosCarbono(50);
        lote1.setIdsCreditosCarbono(creditos);
        lote1.setIdsProprietarios(proprietarios);

        Set<String> novoHistorico = new HashSet<>();
        novoHistorico.add("Criado em 2025-01-01");
        lote1.setHistoricoLote(novoHistorico);

        System.out.println(lote1);

    }
}