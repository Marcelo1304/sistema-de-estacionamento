public class Vaga {
    private boolean ocupada;
    private Veiculo veiculo;

    public Vaga() {
        this.ocupada = false;
        this.veiculo = null;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocupar(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.ocupada = true;
    }

    public Veiculo desocupar() {
        Veiculo veiculoRetornado = this.veiculo;
        this.veiculo = null;
        this.ocupada = false;
        return veiculoRetornado;
    }

    @Override
    public String toString() {
        return "Vaga Disponivel" + ocupada + ", Nenhum" + (veiculo != null ? veiculo.toString() : "Veiculo") + "]";
    }
}
