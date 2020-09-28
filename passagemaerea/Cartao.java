package passagemaerea;

public class Cartao{
    private int numero;
    private String nome;
    private int vencimento;
    private String bandeira;

    public Cartao(){
        numero = 0;
        nome = "";
        vencimento = 0;
        bandeira = "";
    }

    public Cartao(int numero, String nome,int vencimento,String bandeira){
        this.numero = numero; 
        this.nome = nome;
        this.vencimento = vencimento;
        this.bandeira = bandeira;
        
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVencimento(){
        return vencimento;
    } 
    public void setVencimento(int vencimento){
        this.vencimento = vencimento;
    }

    public String getBandeira(){
        return bandeira;
    }
    public void setBandeira(String bandeira){
        this.bandeira = bandeira;
    }
}