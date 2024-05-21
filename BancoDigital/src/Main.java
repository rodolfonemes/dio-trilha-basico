
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();

		banco.adicionarContaCorrente("Rodolfo", "123456789");
		banco.adicionarContaPoupanca("Rosangela", "123456789");
		System.out.println("----------------------------Contas criadas-------------------------------");
		banco.exibirContas();
		System.out.println();
		System.out.println("----------------------------exibe saldo das contas---------------------------");
		System.out.println(banco.pesquisarPorConta(1));
		System.out.println(banco.pesquisarPorConta(2));
		System.out.println();
		System.out.println("---------------deposita 200 na conta 2 e exibe o saldo ----------------------");
		System.out.println(banco.depositoEmConta(2, 200));
		System.out.println();
		System.out.println("--transferencia de 50 da conta 2 para a conta 1 e exibe o saldo -------------");
		System.out.println(banco.transferenciaEmtreContas(2, 1, 50));
		System.out.println();
		System.out.println("---------------saque  75 na conta 2 e exibe o saldo ----------------------");
		System.out.println(banco.saqueEmConta(2, 75));
		System.out.println();
		System.out.println(
				"---------------tentativa de saque  200 na conta 2 e exibe o saldo insuficiente ----------------------");
		System.out.println(banco.saqueEmConta(2, 200));

	}

}
