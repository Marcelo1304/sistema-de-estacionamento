import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(5); // Estacionamento com 5 vagas

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Estacionar veículo");
            System.out.println("2. Remover veículo");
            System.out.println("3. Listar vagas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    Veiculo veiculo = new Veiculo(placa, modelo);
                    estacionamento.estacionar(veiculo);
                    break;
                case 2:
                    System.out.print("Digite a placa do veículo a ser removido: ");
                    String placaRemover = scanner.nextLine();
                    estacionamento.removerVeiculo(placaRemover);
                    break;
                case 3:
                    estacionamento.listarVagas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
