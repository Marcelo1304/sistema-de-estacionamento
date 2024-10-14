import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Vaga> vagas;

    public Estacionamento(int totalVagas) {
        vagas = new ArrayList<>(totalVagas);
        for (int i = 0; i < totalVagas; i++) {
            vagas.add(new Vaga());
        }
    }

    public void estacionar(Veiculo veiculo) {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                vaga.ocupar(veiculo);
                System.out.println("Veículo " + veiculo.getPlaca() + " estacionado na vaga.");
                return;
            }
        }
        System.out.println("Estacionamento cheio. Não foi possível estacionar o veículo " + veiculo.getPlaca() + ".");
    }

    public void removerVeiculo(String placa) {
        for (Vaga vaga : vagas) {
            if (vaga.isOcupada() && vaga.desocupar().getPlaca().equals(placa)) {
                System.out.println("Veículo " + placa + " removido do estacionamento.");
                return;
            }
        }
        System.out.println("Veículo " + placa + " não encontrado no estacionamento.");
    }

    public void listarVagas() {
        System.out.println("Estado das Vagas:");
        for (int i = 0; i < vagas.size(); i++) {
            System.out.println("Vaga " + (i + 1) + ": " + vagas.get(i));
        }
    }
}
