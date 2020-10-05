package passagemaerea;

public class Fisica{
    private String cpf;

    public Fisica(){
        cpf = "0";
    }
    public Fisica(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}