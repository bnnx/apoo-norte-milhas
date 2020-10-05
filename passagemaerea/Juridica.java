package passagemaerea;

public class Juridica{
    private String cnpj;

    public Juridica(){
        cnpj = "0";
    }
    public Juridica(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}