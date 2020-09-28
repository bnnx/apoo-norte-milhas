package passagemaerea;

public class Fisica{
    private  int cpf;

    public Fisica(){
        cpf = 0;
    }
    public Fisica(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }
    public void setCpf( int cpf){
        this.cpf = cpf;
    }
}