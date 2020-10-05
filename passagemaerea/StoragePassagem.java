package passagemaerea;

import java.util.ArrayList;

public class StoragePassagem{
    Leitura l = new Leitura(); 
    
    public Passageiro nPassageiro[];
    public Passagem nPassagem[];
    public Pagamento nPagamento[];
    public Eticket nEticket[];

    ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
    ArrayList<Passagem> passagens = new ArrayList<Passagem>();
    ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    ArrayList<Eticket> etickets = new ArrayList<Eticket>();

    public int getNPassageiro(){
        int size = passageiros.size();
        return size;
    }
    public int getNPassagem(){
        int size = passagens.size();
        return size;
    }
    public int getNPagamento(){
        int size = pagamentos.size();
        return size;
    }
    public int getNEticket(){
        int size = etickets.size();
        return size;
    }

//------------------------------------------Inserir -------------------------------------------------------------
    public void insPassageiro(){
      Passageiro passageiro = new Passageiro();

      passageiro.setNome(l.inDados("\n Informe o Nome Completo: "));
      passageiro.setTelefone(l.inDados("\n Informe o numero do Telefone: "));
      passageiro.setEmail(l.inDados("\n Informe o Email: "));
      passageiro.setEndereco(l.inDados("\n Informe o Endereco: "));
      passageiro.getFisica().setCpf(l.inDados("\n Informe o CPF: "));
      passageiro.getJuridica().setCnpj(l.inDados("\n Informe o CNPJ: "));

      passageiros.add(passageiro);
    }

    public void insPassagem(){
      Passagem passagem = new Passagem();

      passagem.setCodigo(Integer.parseInt(l.inDados("\n Informe o Codigo: ")));
      passagem.setPreco(Integer.parseInt(l.inDados("\n Informe o Preco: ")));
      passagem.getData().setDia(Integer.parseInt(l.inDados("\n Informe o Dia: ")));
      passagem.getData().setMes(Integer.parseInt(l.inDados("\n Informe o Mes: ")));
      passagem.getData().setAno(Integer.parseInt(l.inDados("\n Informe o Ano: ")));
      passagem.getHorario().setHoras(Integer.parseInt(l.inDados("Informe a Hora: ")));
      passagem.getHorario().setMinutos(Integer.parseInt(l.inDados("\n Informe o Minuto: ")));
      passagem.getDestino().setCidade(l.inDados("\n Informe a Cidade: "));
      passagem.getDestino().setEstado(l.inDados("\n Informe o Estado: "));
      passagem.getDestino().setPais(l.inDados("\n Informe o Pais: "));
      passagem.getOrigem().setCidade(l.inDados("\n Informe a Cidade: "));
      passagem.getOrigem().setEstado(l.inDados("\n Informe o Estado: "));
      passagem.getOrigem().setPais(l.inDados("\n Informe o Pais: "));        
      passagem.getClasse().setEconomica(l.inDados("\n Economica: "));
      passagem.getClasse().setExecutiva(l.inDados("\n Executiva: "));

      passagens.add(passagem);
    }

    public void insPagamento(){
      Pagamento pagamento = new Pagamento();

      pagamento.setDesconto(Integer.parseInt(l.inDados("\n Informe o Desconto")));
      pagamento.getCredito().setNumero(Integer.parseInt(l.inDados("\n Informe o numero do cartao:")));
      pagamento.getCredito().setNome(l.inDados("\n Informe o nome:"));
      pagamento.getCredito().setVencimento(Integer.parseInt(l.inDados("\n Informe a data de Vencimento:")));
      pagamento.getCredito().setBandeira(l.inDados("\n Informe a Bandeira:"));  
      pagamento.getDebito().setNumero(Integer.parseInt(l.inDados("\n Informe o numero do cartao:")));
      pagamento.getDebito().setNome(l.inDados("\n Informe o nome:"));
      pagamento.getDebito().setVencimento(Integer.parseInt(l.inDados("\n Informe a data de Vencimento:")));
      pagamento.getDebito().setBandeira(l.inDados("\n Informe a Bandeira:"));
      pagamento.getTransferencia().setConta(Integer.parseInt(l.inDados("\n Informe a Conta:")));
      pagamento.getTransferencia().setAgencia(Integer.parseInt(l.inDados("\n Informe a Agencia:")));
      pagamento.getTransferencia().setBanco(Integer.parseInt(l.inDados("\n Informe o Banco:")));
      pagamento.getTransferencia().setFavorecido(l.inDados("\n Informe o Favorecido:"));

      pagamentos.add(pagamento);
    }

    public void insEticket(){
      Eticket eticket = new Eticket();

      eticket.setLocalizador(Integer.parseInt(l.inDados("Informe o Localizador: ")));
      eticket.setCodigoBarras(Integer.parseInt(l.inDados("\n Informe o Codigo de Barras:")));

      etickets.add(eticket);
    }
//-------------------------------------------Consultar ----------------------------------------------------------
    public void consPassageiro(String cpf){
      for(int i = 0; i < passageiros.size(); i++){
        if(passageiros.get(i).getNome().equals(cpf)){
          System.out.println("\n Passageiro encontrado.\n");
          System.out.println("......Dados do Passageiro......");
          System.out.println("\n Nome: "+ passageiros.get(i).getNome());
          System.out.println("\n Telefone: "+ passageiros.get(i).getTelefone());
          System.out.println("\n Email: "+ passageiros.get(i).getEmail());
          System.out.println("\n Endereco: "+ passageiros.get(i).getEndereco());
          System.out.println("\n CPF: "+ passageiros.get(i).getFisica().getCpf());
          System.out.println("\n CNPJ: " + passageiros.get(i).getJuridica().getCnpj());
          return;
        }
      }
      System.out.println("\n Passageiro nao encontrado. \n");
    }
    
    public void consPassagem(int codigo){
      for(int i = 0; i < passagens.size(); i++){
        if(passagens.get(i).getCodigo() == codigo){
          System.out.println("\n Passagem encontrada. \n");

          System.out.println("......Dados da Passagem Aerea......");

          System.out.println("\n Codigo: " + passagens.get(i).getCodigo());
          System.out.println("\n Preco: "+ passagens.get(i).getPreco());
          System.out.println("\n Dia: "+ passagens.get(i).getData().getDia());
          System.out.println("\n Mes: "+ passagens.get(i).getData().getMes());
          System.out.println("\n Ano: "+ passagens.get(i).getData().getAno());
          System.out.println("\n Horas: "+ passagens.get(i).getHorario().getHoras());
          System.out.println("\n Minutos: "+ passagens.get(i).getHorario().getMinutos());
          System.out.println("\n Cidade: "+ passagens.get(i).getDestino().getCidade());
          System.out.println("\n Estado: "+ passagens.get(i).getDestino().getEstado());
          System.out.println("\n Pais: "+ passagens.get(i).getDestino().getPais());
          System.out.println("\n Cidade: "+ passagens.get(i).getOrigem().getCidade());
          System.out.println("\n Estado: "+ passagens.get(i).getOrigem().getEstado());
          System.out.println("\n Pais: "+ passagens.get(i).getOrigem().getPais());
          System.out.println("\n Economica: "+ passagens.get(i).getClasse().getEconomica());
          System.out.println("\n Executiva: "+ passagens.get(i).getClasse().getExecutiva());
          return;
        }
      }
      System.out.println("\n Passagem nao encontrada. \n");
    }

    public void consPagamento(String nome){
      for(int i = 0; i < pagamentos.size(); i++){
        if(pagamentos.get(i).getCredito().getNome().equals(nome)){
          System.out.println("\n Pagamento realizado. \n");
          
          System.out.println("......Dados do Pagamento......");

          System.out.println("\n Desconto: "+ pagamentos.get(i).getDesconto());
          System.out.println("\n Numero: "+ pagamentos.get(i).getCredito().getNumero());
          System.out.println("\n Nome: "+ pagamentos.get(i).getCredito().getNome());
          System.out.println("\n Vencimento: "+ pagamentos.get(i).getCredito().getVencimento());
          System.out.println("\n Bandeira: "+ pagamentos.get(i).getCredito().getBandeira());
          System.out.println("\n Numero: "+ pagamentos.get(i).getDebito().getNumero());
          System.out.println("\n Nome: "+ pagamentos.get(i).getDebito().getNome());
          System.out.println("\n Vencimento: "+ pagamentos.get(i).getDebito().getVencimento());
          System.out.println("\n Bandeira: "+ pagamentos.get(i).getDebito().getBandeira());
          System.out.println("\n Conta: "+ pagamentos.get(i).getTransferencia().getConta());
          System.out.println("\n Agencia: "+ pagamentos.get(i).getTransferencia().getAgencia());
          System.out.println("\n Banco: "+ pagamentos.get(i).getTransferencia().getBanco());
          System.out.println("\n Favorecido: "+ pagamentos.get(i).getTransferencia().getFavorecido());
          return;
        }
      }
      System.out.println("\n Pagamento nao encontrado. \n");
    }

    public void consEticket(int localizador){
      for(int i = 0; i < etickets.size(); i++){
        if(etickets.get(i).getLocalizador() == localizador){
          System.out.println("\n Eticket Encontrado. \n");
          System.out.println("......Dados do Eticket......");

          System.out.println("\n Localizador: "+ etickets.get(i).getLocalizador());
          System.out.println("\n Codigo de Barras: "+ etickets.get(i).getCodigoBarras());
          return;
        }
      }
      System.out.println("\n Eticket nao encontrado. \n");
    }

//-----------------------------------------Alterar ----------------------------------------------------
    public void alteraPassageiro(String nome){
      for(int i=0; i < passageiros.size();i++){
        if(passageiros.get(i).getNome().equals(nome)){
          passageiros.get(i).setNome(l.inDados("\n Informe o Nome: "));
          passageiros.get(i).setTelefone(l.inDados("\n Informe o Telefone: "));
          passageiros.get(i).setEmail(l.inDados("\n Informe o Email: "));
          passageiros.get(i).getFisica().setCpf(l.inDados("\n Informe o CPF: "));
          passageiros.get(i).getJuridica().setCnpj(l.inDados("Informe o CNPJ: "));
          return;
        }
      }
      System.out.println("Passageiro nao encontrado.");
    }

    public void alteraPassagem(int codigo){
      for(int i = 0; i < passagens.size(); i++){
        if(passagens.get(i).getCodigo() == codigo){
          passagens.get(i).setCodigo(Integer.parseInt(l.inDados("\n Informe o codigo: ")));
          passagens.get(i).setPreco(Integer.parseInt(l.inDados("\n Informe o Preco: ")));
          passagens.get(i).getData().setDia(Integer.parseInt(l.inDados("\n Informe o Dia: ")));
          passagens.get(i).getData().setMes(Integer.parseInt(l.inDados("\n Informe o Mes: ")));
          passagens.get(i).getData().setAno(Integer.parseInt(l.inDados("\n Informe o Ano: ")));
          passagens.get(i).getHorario().setHoras(Integer.parseInt(l.inDados("\n Informe a Hora: ")));
          passagens.get(i).getHorario().setMinutos(Integer.parseInt(l.inDados("\n Informe o Minulto: ")));
          passagens.get(i).getDestino().setCidade(l.inDados("\n Informe a Cidade: "));
          passagens.get(i).getDestino().setEstado(l.inDados("\n Informe o Estado: "));
          passagens.get(i).getDestino().setPais(l.inDados("\n Informe o Pais: "));
          passagens.get(i).getOrigem().setCidade(l.inDados("\n Informe a Cidade: "));
          passagens.get(i).getOrigem().setEstado(l.inDados("\n Informe o Estado: "));
          passagens.get(i).getOrigem().setPais(l.inDados("\n Informe o Pais: "));
          passagens.get(i).getClasse().setEconomica(l.inDados("\n  Ecnomica:  "));
          return;
        }
      }
      System.out.println("Passagem nao encontrado.");
    }    

    public void alteraPagamento(int desconto){
      for(int i = 0; i < pagamentos.size(); i++){
        if(pagamentos.get(i).getDesconto() == desconto){
          pagamentos.get(i).setDesconto(Integer.parseInt(l.inDados("\n Informe o Desconto: ")));
          pagamentos.get(i).getCredito().setNumero(Integer.parseInt(l.inDados("\n Informe o Numero: ")));
          pagamentos.get(i).getCredito().setNome(l.inDados("\n Informe o Nome.:"));
          pagamentos.get(i).getCredito().setVencimento(Integer.parseInt(l.inDados("\n Informe o vencimento: ")));
          pagamentos.get(i).getCredito().setBandeira(l.inDados("\n Informe a Bandeira: "));
          pagamentos.get(i).getDebito().setNumero(Integer.parseInt(l.inDados("\n Informe o Numero: ")));
          pagamentos.get(i).getDebito().setNome(l.inDados("\n Informe o Nome: "));
          pagamentos.get(i).getDebito().setVencimento(Integer.parseInt(l.inDados("\n Informe o vencimento: ")));
          pagamentos.get(i).getDebito().setBandeira(l.inDados("\n Informe a Bandeira: "));
          pagamentos.get(i).getTransferencia().setConta(Integer.parseInt(l.inDados("\n Informe a Conta: ")));
          pagamentos.get(i).getTransferencia().setAgencia(Integer.parseInt(l.inDados("\n Informe a Agencia: ")));
          pagamentos.get(i).getTransferencia().setBanco(Integer.parseInt(l.inDados("\n Informe o Banco: ")));
          pagamentos.get(i).getTransferencia().setFavorecido(l.inDados("\n Informe o Favorecido: "));
          return;
        }
      }
      System.out.println("Pagamento nao encontrado.");
    }    

    public void alteraEticket(int localizador){
      for(int i = 0; i < etickets.size(); i++){
        if(etickets.get(i).getLocalizador() == localizador){
          etickets.get(i).setLocalizador(Integer.parseInt(l.inDados("\n Informe o Localizador: ")));
          etickets.get(i).setCodigoBarras(Integer.parseInt(l.inDados("\n Informe o Codigo de Barras: ")));
          return;
        }
      }
      System.out.println("Eticket nao encontrado.");
    }

//----------------------------------------------Excluir---------------------------------------------------
    public void excluirPassageiro(String cpf){
      for(int i = 0; i < passageiros.size(); i++){
        if(passageiros.get(i).getFisica().getCpf().equals(cpf)){
          passageiros.remove(passageiros.get(i));
          System.out.println("Passageiro excluido.");
          return;
        }
      }
      System.out.println("Passageiro nao encontrado.");
    }

    public void excluirPassagem(int codigo){
      for(int i = 0; i < passagens.size(); i++){
        if(passagens.get(i).getCodigo() == codigo){
          passagens.remove(passagens.get(i));
          System.out.println("Passagem excluida.");
          return;
        }
      }
      System.out.println("Passagem nao encontrado.");
    }

    public void excluirPagamento(int desconto){
      for(int i = 0; i < pagamentos.size(); i++){
        if(pagamentos.get(i).getDesconto() == desconto){
          pagamentos.remove(pagamentos.get(i));
          System.out.println("Pagamento excluida.");
          return;   
        }  
      }
      System.out.println("Pagamento nao encontrado.");
    }

    public void excluirEtcket(int localizador){
      for(int i = 0; i < etickets.size(); i++){
        if(etickets.get(i).getLocalizador() == localizador){
          etickets.remove(etickets.get(i));
          System.out.println("Eticket excluido");
          return;
        }
      }
      System.out.println("Eticket nao encontrado.");
    }

}
