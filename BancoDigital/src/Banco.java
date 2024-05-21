import java.util.HashSet;
import java.util.Set;

public class Banco {

	private String nome;
	private Set<Conta> contasList;

	public Banco() {
		this.contasList = new HashSet<>();
	}

	public void adicionarContaCorrente(String nome, String cpf) {
		Cliente correntista = new Cliente();
		correntista.setNome(nome);
		correntista.setCpf(cpf);

		this.contasList.add(new ContaCorrente(correntista));
	}

	public void adicionarContaPoupanca(String nome, String cpf) {
		Cliente correntista = new Cliente();
		correntista.setNome(nome);
		correntista.setCpf(cpf);

		this.contasList.add(new ContaPoupanca(correntista));
	}

	public Set<Conta> pesquisarPorConta(int conta) {
		Set<Conta> contaPorNumero = new HashSet<>();
		if (!contasList.isEmpty()) {
			for (Conta c : contasList) {
				if (c.getNumero() == conta) {
					contaPorNumero.add(c);
				}
			}
			return contaPorNumero;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Set<Conta> depositoEmConta(int conta, double valor) {
		Set<Conta> contaPorNumero = new HashSet<>();
		if (!contasList.isEmpty()) {
			for (Conta c : contasList) {
				if (c.getNumero() == conta) {
					c.saldo = c.saldo + valor;
					contaPorNumero.add(c);
				}
			}
			return contaPorNumero;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Set<Conta> saqueEmConta(int conta, double valor) {
		Set<Conta> contaPorNumero = new HashSet<>();
		if (!contasList.isEmpty()) {
			for (Conta c : contasList) {
				if (c.getNumero() == conta) {
					if (c.saldo >= valor) {
						c.saldo = c.saldo - valor;
						contaPorNumero.add(c);
					} else {
						System.out.println("saldo insuficiente");
					}
				}
			}
			return contaPorNumero;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Set<Conta> transferenciaEmtreContas(int contaOrigem, int contaDestino, double valor) {
		Set<Conta> contaPorNumero = new HashSet<>();
		if (!contasList.isEmpty()) {
			for (Conta c : contasList) {
				if (c.getNumero() == contaOrigem) {
					if (c.saldo >= valor) {
						c.saldo = c.saldo - valor;
						contaPorNumero.add(c);

						if (c.getNumero() == contaDestino) {

							c.saldo = c.saldo + valor;
							contaPorNumero.add(c);
						}
					} else {
						System.out.println("saldo insuficiente");
					}
				}
			}
			return contaPorNumero;
		} else {
			throw new RuntimeException("Conta de Origem ou Destino invalida");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conta> getContas() {
		return contasList;
	}

	public void setContas(Set<Conta> contas) {
		this.contasList = contas;
	}

	@Override
	public String toString() {
		return contasList + "";
	}

	public void exibirContas() {
		if (!contasList.isEmpty()) {
			System.out.println(this.contasList);

		} else {
			System.out.println("A lista está vazia!");
		}
	}

}
