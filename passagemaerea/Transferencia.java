package passagemaerea;

public class Transferencia{   
    private int conta;
    private int agencia;
    private int banco;
    private String favorecido;

    public Transferencia(){
        conta = 0;
        agencia = 0;
        banco = 0;
        favorecido = "";

    }

    public Transferencia( int conta, int agencia,int banco, String favorecido){
        this.conta = conta;
        this.agencia = agencia;
        this.banco = banco;
        this.favorecido = favorecido;
    }

    public int getConta(){
        return conta;
    }
    public void setConta(int conta){
        this.conta = conta;
    }

    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getBanco(){
        return banco;
    }
    public void setBanco(int banco){
        this.banco = banco;
    }

    public String getFavorecido(){
        return favorecido;
    }
    public void setFavorecido(String favorecido){
        this.favorecido = favorecido;
    }
}
