public class BancoNubank extends Banco{

    public BancoNubank(Pagamento tipoPagamento){
        super(tipoPagamento);
    }

    public String transacao(){
        return "Banco Nubank " + tipoPagamento.emitir();
    }
}
