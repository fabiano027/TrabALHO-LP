package trabalhoCinthia;
import java.util.ArrayList;

import io.InOut;
public class UsaClient {

	public static void main(String[] args) {
	
       ArrayList<Client> clientes = new ArrayList<Client>();
		
       
       String opcao;
		do{
			opcao = ExibirMenu();
			switch(opcao){
				case"1":
					gerarSenha();
				break;
				
				case"2":
					atendimento();
				break;
					
				case"3":
					sairDaFila();
				break;
				
				case"4":
					mostrarTodosOsClientesNaoAtendidos();
				break;
				
				case"5":
				break;
			}
		}while(!opcao.equals("5"));
		
		

	}

	private static void gerarSenha(ArrayList<Client>clientes) {
		String nome = InOut.leString("Digite seu nome:");
		Client cliente = new Client(nome);
		clientes.add(cliente);
		InOut.msgDeAviso(null, "Nome do Cliente:" + cliente.getNome() +
				"Senha do cliente: " + cliente.getSenhaDoCliente());
				
	}

	private static String ExibirMenu() {
		String opcao = InOut.leString("1 - Gerar Senha\n "
				+ "2 - Atendimento\n"
				+ "3 - Sair da fila\n"
				+ "4 - Mostrar cliente não atendidos\n"
				+ "5 - sair");
		return opcao;
	}

}
