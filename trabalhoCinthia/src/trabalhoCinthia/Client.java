package trabalhoCinthia;

public class Client {

	private static int senhaDeAtendimento = 0;
	private static int geradorDeSenha = 1;
	
	private int senhaDoCliente;
	private String nome;
	
	public Client(String nome) {
		this.nome = nome;
		this.senhaDoCliente = geradorDeSenha++;
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getSenhaDeAtendimento() {
		return senhaDeAtendimento;
	}

	public int getSenhaDoCliente() {
		return senhaDoCliente;
	}

	@Override
	public String toString() {
		return "Client [senhaDoCliente=" + senhaDoCliente + ", nome=" + nome + "]";
	}

	public int proximo() {
		senhaDeAtendimento++;
		return senhaDeAtendimento;
	}
	
	
}
