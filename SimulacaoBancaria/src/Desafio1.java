import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        boolean sair = true;
        while (sair) {

            int opcao = scanner.nextInt();

            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1: {
                    Double valor = scanner.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 2: {
                    Double valor = scanner.nextDouble();
                    if (valor > saldo) {

                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valor;
                        System.out.println("Saldo atual: " + saldo);
                    }

                    break;
                }
                case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 0: {
                    System.out.println("Programa encerrado.");
                    sair = false;
                    break;
                }

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
        scanner.close();
    }
}
