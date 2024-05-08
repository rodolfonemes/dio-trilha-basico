import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // declara a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // solicitas os dados para criação da conta
        System.out.println("Por favor, digite o número da Conta ! (Somente Numeros)");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        scanner.nextLine();// Essa linha faz com que o `\n` que restou do input numérico seja consumido.
        System.out.println("Por favor, digite o Nome do Cliente !");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta !");
        double saldo = scanner.nextDouble();

        // imprimindo os dados da conta criada

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " , conta " + conta + " e seu saldo R$:" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
