public abstract class Banco {
    protected Pagamento tipoPagamento;

    public Banco(Pagamento tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }

    public abstract String transacao();
}
