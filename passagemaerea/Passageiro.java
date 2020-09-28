package passagemaerea;

public class Passageiro{
    private String nome;
    private int telefone;
    private String email;
    private String endereco;
    private Fisica fisica = new Fisica();
    private Juridica juridica = new Juridica();

    public Passageiro(){
        nome = "";
        telefone =  0;
        email = "";
        endereco = "";
        fisica = new Fisica();
        juridica = new Juridica();
    }

    public Passageiro( String nome, int telefone, String email, String endereco , Fisica fisica ,Juridica juridica){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.fisica = new Fisica();
        this.juridica = new Juridica();

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTelefone(){
        return telefone;  
    }
    public void setTelefone(int telefone){
        this.telefone = telefone ; 
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public Fisica getFisica(){
        return fisica;
    }
    public void setFisica(Fisica fisica){
        this.fisica = fisica;
    }
    public Juridica getJuridica(){
        return juridica;
    }
    public void setJuridica(Juridica juridica){
        this.juridica = juridica;
    }

}
