import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
            System.out.println("---------------------");
        }
    }
}
