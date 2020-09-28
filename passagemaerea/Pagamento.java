package passagemaerea;

public class Pagamento {
    private int desconto;
    private Cartao credito = new Cartao();
    private Cartao debito = new Cartao();
    private Transferencia transferencia = new Transferencia();

    public Pagamento(){
        desconto = 0;
        credito = new Cartao();
        debito = new Cartao();
        transferencia = new Transferencia();

    }

    public Pagamento( int desconto, Cartao credito,Cartao debito, Transferencia transferencia){
        this.desconto = desconto;
        credito = new Cartao();
        debito = new Cartao();
        transferencia = new Transferencia();
    }

    public int getDesconto(){
        return desconto;
    }
    public void setDesconto(int desconto){
        this.desconto = desconto;
    }

    public Cartao getCredito(){
        return credito;
    }
    public void setCredito(Cartao credito){
        this.credito = credito;
    }

    public Cartao getDebito(){
        return debito;
    }
    public void setDebito(Cartao debito){
        this.debito = debito;
    }

    public Transferencia getTransferencia(){
        return transferencia;
    }
    public void setTransferencia( Transferencia transferencia){
        this.transferencia = transferencia;
    }

}
