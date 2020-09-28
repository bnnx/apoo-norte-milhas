package passagemaerea;

public class Eticket {
    private int localizador;
    private int codigoBarras;

    public Eticket(){
        localizador = 0;
        codigoBarras = 0;
    }

    public Eticket(int localizador, int codigoBarras){
        this.localizador = localizador;
        this.codigoBarras = codigoBarras;
    }

    public int getLocalizador(){
        return localizador;
    }
    public void setLocalizador(int localizador){
        this.localizador = localizador;
    }

    public int getCodigoBarras(){
        return codigoBarras;
    }
    public void setCodigoBarras(int codigoBarras){
        this.codigoBarras = codigoBarras;
    }
}