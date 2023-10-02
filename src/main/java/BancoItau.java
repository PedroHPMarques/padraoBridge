public class BancoItau extends Banco{

    public BancoItau(Pagamento tipoPagamento){
        super(tipoPagamento);
    }

    public String transacao(){
        return "Banco Itaú " + tipoPagamento.emitir();
    }
}
