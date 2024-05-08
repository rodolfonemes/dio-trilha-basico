import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = 0;

        for (double valorSaque = saque; limiteDiario > valorSaque; limiteDiario -= valorSaque) {

            saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            } else {

                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {

                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
            scanner.close();
        }

        scanner.close();
    }
}
