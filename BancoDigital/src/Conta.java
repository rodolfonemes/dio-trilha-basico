
public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Cliente cpf;

	public Conta(Cliente cliente, Cliente cpf) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.cpf = cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return (String.format("Titular: %s", this.cliente.getNome() + " CPF: " + this.cliente.getCpf()))
				+ (String.format(" Agencia: %d", this.agencia)) + (String.format(" Numero: %d", this.numero))
				+ (String.format(" Saldo: %.2f", this.saldo)) + "\n";
	}

}
