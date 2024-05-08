import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro Numero");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Numero");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {

            int contagem = parametroDois - parametroUm;
            System.out.println("contagem: " + contagem);
            for (int f = 0; f <= contagem; f++) {
                System.out.println("Imprimindo o número " + f);
            }
        }
    }

}
