package passagemaerea;

public class TstObjPassagem {
    public static void main(String[]args){
        boolean menuExit = false;
		int escolhaCase = 0;
		int escolhaPas = 0;
		StoragePassagem stoPas = new StoragePassagem();
		Leitura l = new Leitura(); 

        do{
            System.out.println(".......  Menu Principal.......");
				System.out.println("Seja Bem Vindo!");
				System.out.println("1 - Inserir ");
				System.out.println("2 - Consultar ");
				System.out.println("3 - altera ");
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

                	if(escolhaPas == 1){
						Passageiro passageiro = new Passageiro();
							stoPas.insPassageiro(passageiro);
							System.out.println("Passageiro Inserido.");
					}else{
						Passagem passagem = new Passagem();
							stoPas.insPassagem(passagem);
							System.out.println("Passagem Inserida.");
					}if(escolhaPas == 1){
						Pagamento Pagamento = new Pagamento();
							stoPas.insPagamento(Pagamento);
							System.out.println("Pagamento Inserido.");
					}else{
						Eticket eticket = new Eticket();
							stoPas.insEticket(eticket);
							System.out.println("Eticket Inserido");
					}
				break;

				case 2:

				    if(escolhaPas == 1){
						if(stoPas.getNPassageiro()== 0){
							System.out.println("Passageiro Cadastrado.");
						}else{
							stoPas.consPassageiro(l.inDados(" Digite o nome do Passageiro Procurado.:"));
						}if(stoPas.getNPassagem()== 0){
							System.out.println("Passagem Cadastrada.");
						}else{
							stoPas.consPassagem(Integer.parseInt(l.inDados(" Digite o Cpf Procurado.:")));
						}if(stoPas.getNPagamento()== 0){
							System.out.println("Pagamento Cadastrado.");
						}else{
							stoPas.consPagamento(l.inDados(" Digite o nome do Pagamento Procurado.:"));
						}if(stoPas.getNEticket()== 0){
							System.out.println("Eticket Cadastrado.");
						}else{
							stoPas.consEticket(l.inDados(" Digite o nome do Eticket Procurado.:"));
						}
					}
			    break;

				case 3:
					if(escolhaPas == 1){
						if(stoPas.getNPassageiro() == 0){
						System.out.println(" Passageiro Alterado.");
						}else{
							stoPas.alteraPassageiro(l.inDados("Digite o nome do Passageiro para ser alterado.:"));
						}if(stoPas.getNPassagem() == 0){
						System.out.println(" Passagem Alterada.");
						}else{
							stoPas.alteraPassagem(Integer.parseInt(l.inDados("Digite o cpf para ser alterado a Passagem.:")));
						}if(stoPas.getNPagamento() == 0){
						System.out.println(" Passagamento Alterado.");
						}else{
							stoPas.alteraPagamento(l.inDados("Digite o nome do Passageiro para ser alterado o Pagamento.:"));
						}if(stoPas.getNEticket() == 0){
						System.out.println(" Eticket Alterado.");
						}else{
							stoPas.alteraEticket(l.inDados("Digite o nome do Passageiro para ser alterado o Eticket.:"));
						}
					}
				break;

				case 4:
				    if(escolhaPas == 1){
						if(stoPas.getNPassageiro() == 0){
						System.out.println(" Passageiro Excluido.");
						}else{
							stoPas.excluirPassageiro(l.inDados("Digite o nome do Passageiro para ser alterado.:"));
						}if(stoPas.getNPassagem() == 0){
						System.out.println(" Passagem Excluido.");
						}else{
							stoPas.excluirPassagem(Integer.parseInt(l.inDados("Digite o cpf para ser excluido a Passagem.:")));
						}if(stoPas.getNPagamento() == 0){
						System.out.println(" Passagamento Excluido.");
						}else{
							stoPas.excluirPagamento(Integer.parseInt(l.inDados("Digite o cpf do Passageiro para ser excluido o Pagamento.:")));
						}if(stoPas.getNEticket() == 0){
						System.out.println(" Eticket Excluido.");
						}else{
							stoPas.excluirEtcket(l.inDados("Digite o nome do Passageiro para ser excluido o Eticket.:"));
						}
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
