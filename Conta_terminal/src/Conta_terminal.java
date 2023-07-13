import java.util.Scanner;

public class Conta_terminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();

            System.out.println("Por favor, digite a agência:");
            String agencia = scanner.next();

            boolean sair = false;
            while (!sair) {
                System.out.println("Opções disponíveis:");
                System.out.println("1. Ver saldo disponível");
                System.out.println("2. Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo disponível: " + saldo);
                        break;
                    case 2:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            }

            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

            System.out.println(mensagem);
        }
    }
}
