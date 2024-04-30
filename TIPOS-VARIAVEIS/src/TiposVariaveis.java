public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        System.out.println("idade: " + idade);
        System.out.println("ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("PI: " + pi);
        System.out.println("Salario: " + salario);

        final double VALOR_DE_PI = 3.14;
        System.out.println("PI final: " + VALOR_DE_PI);
        // VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

    }
}
