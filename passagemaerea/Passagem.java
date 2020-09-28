package passagemaerea;

public class Passagem implements ComputCpf,ComputNome{
    private int codigo;
    private int preco;
    private Data data = new Data(); 
    private Horario horario = new Horario();
    private Rota destino = new Rota();
    private Rota origem = new Rota();
    private Classe classe = new Classe();

    public Passagem(){
        codigo = 0;
        preco = 0;
        data = new Data();  
        horario= new Horario();
        destino = new Rota();
        origem = new Rota();
        classe = new Classe();

    }

    public Passagem(int codigo, int preco, Data data,Horario horario, Rota destino, Rota origem,Classe classe){
        this.preco = preco;
        this.codigo = codigo;
        data = new Data();  
        horario = new Horario();
        destino = new Rota();
        origem = new Rota();
        classe = new Classe();

    }

    public int getPreco() {
		return preco;
	}
	public void setPreco(int  preco) {
		this.preco = preco;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public Data getData(){
        return data;
    }
    public void setData(Data data){
        this.data = data;
    }

    public Horario getHorario(){
        return horario;
    }
    public void setHorario(Horario horario){
        this.horario = horario;
    }

    public Rota getDestino(){
        return destino;
    }
    public void setDestino(Rota destino){
        this.destino = destino;
    }

    public Rota getOrigem(){
        return origem;
    }
    public void setOrigem(Rota origem){
        this.origem = origem;
    }
    
    public Classe getClasse(){
        return classe;
    }
    public void setClasse(Classe classe){
        this.classe = classe;
    }
//----------------------------------
    public void calcString() {
		System.out.println("\n Metodo CalcString() da inteface ComputNome");

	}
	public void calcNumero() {
		System.out.println("\n Metodo CalcNumero() da inteface ComputCpf");
	}

    

}