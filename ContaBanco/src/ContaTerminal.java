import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do cliente?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual é a agência bancária?");
        String agencia = scanner.nextLine();

        System.out.println("Qual é o número da conta?");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual é o saldo da conta?");
        // O double só está retornando valores decimais separados por vírgula
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + "!");
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + "\nConta " + numeroConta + "\nSeu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
