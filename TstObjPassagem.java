//package passagemaerea;

import passagemaerea.*;

public class TstObjPassagem {
	public static void main(String[]args){
		boolean menuExit = false;
		int escolhaCase = 0;
		int escolhaPas = 0;
		StoragePassagem stoPas = new StoragePassagem();
		Leitura l = new Leitura(); 

		do {
			System.out.println(".......  Menu Principal.......");
			System.out.println("Seja Bem Vindo!");
			System.out.println("1 - Inserir ");
			System.out.println("2 - Consultar ");
			System.out.println("3 - Alterar ");
			System.out.println("4 - Excluir ");
			System.out.println("5 - Fechar Programa");
			System.out.print("Escolha uma Opcao: ");
			escolhaCase = Integer.parseInt(l.inDados(""));
					
			if (escolhaCase >= 1 && escolhaCase <= 4) {
				System.out.println("1 - Passageiro");
				System.out.println("2 - Passagem");
				System.out.println("3 - Pagamento");
				System.out.println("4 - E-ticket");
				System.out.print("Escolha uma Opcao: ");
				escolhaPas = Integer.parseInt(l.inDados(""));
				System.out.println("");        
			}

			switch(escolhaCase){
				case 1:
					switch(escolhaPas) {
						case 1:
							stoPas.insPassageiro();
							System.out.println("Passageiro Inserido.");
						break;
						case 2:
							stoPas.insPassagem();
							System.out.println("Passagem Inserida.");
						break;
						case 3:
							stoPas.insPagamento();
							System.out.println("Pagamento Inserido.");
						break;
						case 4:
							stoPas.insEticket();
							System.out.println("Eticket Inserido");
						break;
					}
				break;

				case 2:
					switch(escolhaPas) {
						case 1:
							stoPas.consPassageiro(l.inDados(" Digite o CPF do passageiro procurado: "));
						break;

						case 2:
							stoPas.consPassagem(Integer.parseInt(l.inDados(" Digite o Codigo Procurado.:")));
						break;

						case 3:
							stoPas.consPagamento(l.inDados(" Digite o nome do Pagamento Procurado.:"));
						break;

						case 4:
							stoPas.consEticket(Integer.parseInt(l.inDados(" Digite o localizador do Eticket Procurado.:")));
						break;
					}
				break;

				case 3:
					switch(escolhaPas) {
						case 1:
							stoPas.alteraPassageiro(l.inDados("Digite o nome do Passageiro para ser alterado.:"));
						break;

						case 2:
							stoPas.alteraPassagem(Integer.parseInt(l.inDados("Digite o cpf para ser alterado a Passagem.:")));
						break;

						case 3:
							stoPas.alteraPagamento(Integer.parseInt(l.inDados("Digite o desconto Pagamento.:")));
						break;

						case 4:
							//stoPas.alteraEticket(l.inDados("Digite o nome do Passageiro para ser alterado o Eticket.:"));
							stoPas.alteraEticket(Integer.parseInt(l.inDados("Digite o localizador do Eticket.:")));
						break;
					}
				break;

				case 4:
					switch(escolhaPas) {
						case 1:
							stoPas.excluirPassageiro(l.inDados("Digite o CPF do passageiro a ser excluido: "));
						break;

						case 2:
							stoPas.excluirPassagem(Integer.parseInt(l.inDados("Digite o codigo para ser excluido a Passagem.:")));
						break;

						case 3:
							stoPas.excluirPagamento(Integer.parseInt(l.inDados("Digite o desconto para ser excluido o Pagamento.:")));
						break;

						case 4:
							stoPas.excluirEtcket(Integer.parseInt(l.inDados("Digite o localizador para ser excluido o Eticket.:")));
						break;
					}
				break;
				
				case 5:
					menuExit = true;
				break;

				default:
					System.out.println("Por favor, escolha uma opcao valida.");
			}
	
				if (Integer.parseInt(l.inDados("\nDigite 1 para sair ou 2 para voltar ao Menu Principal...")) == 1) {
					menuExit = true;
				}
		} while (!menuExit);
	}
}
