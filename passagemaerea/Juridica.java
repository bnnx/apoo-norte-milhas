package passagemaerea;

public class Juridica{
    private  int cnpj;

    public Juridica(){
        cnpj = 0;
    }
    public Juridica(int cnpj){
        this.cnpj = cnpj;
    }

    public int getCnpj(){
        return cnpj;
    }
    public void setCnpj( int cnpj){
        this.cnpj = cnpj;
    }
}