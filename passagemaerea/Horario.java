package passagemaerea;

public class Horario{
    private int minutos;
    private int horas;

    public Horario(){
        minutos = 0;
        horas = 0;
    }
    public Horario(int minutos, int horas){
        this.minutos = minutos;
        this.horas = horas;
    }


    public int getMinutos(){
        return minutos;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
}