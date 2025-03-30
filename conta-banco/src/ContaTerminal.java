import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando os dados da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Fechando o Scanner
        scanner.close();

        // Exibindo a mensagem final
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "+
                           "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

