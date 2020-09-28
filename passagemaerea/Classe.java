package passagemaerea;

public class Classe {
    private String economica;
    private String executiva;

    public Classe(){
        economica = "";
        executiva = "";
    }

    public Classe(String economica, String executiva){
        this.economica = economica;
        this.executiva = executiva;
    }

    public String getEconomica(){
        return economica;
    }
    public void setEconomica(String economica){
        this.economica = economica;
    }

    public String getExecutiva(){
        return executiva;
    }
    public void setExecutiva(String executiva){
        this.executiva = executiva;
    }
}