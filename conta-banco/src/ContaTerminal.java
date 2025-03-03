import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao SB (Seu Banco)." + "\n");
        
        System.out.print("Por favor, informe seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("\n" + "Muito bem, " + nome + ". Agora, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\n" + "Quase lá! Informe o número da agência (xxx-x): ");
        String agencia = scanner.nextLine();

        System.out.println("Cliente: " + nome);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Agência: " + agencia + "\n");

        System.out.println(nome + ", obrigado pela confiança, sua agência é '" + agencia + "', conta '" + numeroConta + "' e seu saldo já está dispinível para saque.");



    }
}
