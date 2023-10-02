public class BancoBradesco extends Banco{

    public BancoBradesco(Pagamento tipoPagamento){
        super(tipoPagamento);
    }

    public String transacao(){
        return "Banco Bradesco " + tipoPagamento.emitir();
    }
}
