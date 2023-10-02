import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoNubankTest {
    @Test
    void deveRetornarBancoNubankViaPix() {
        Pagamento tipoPagamento = new Pix();
        BancoNubank banco = new BancoNubank(tipoPagamento);
        assertEquals("Banco Nubank pagamento no pix", banco.transacao());
    }

    @Test
    void deveRetornarBancoNubankViaCredito() {
        Pagamento tipoPagamento = new Credito();
        BancoNubank banco = new BancoNubank(tipoPagamento);
        assertEquals("Banco Nubank pagamento no crédito", banco.transacao());
    }

    @Test
    void deveRetornarBancoNubankViaDebito() {
        Pagamento tipoPagamento = new Debito();
        BancoNubank banco = new BancoNubank(tipoPagamento);
        assertEquals("Banco Nubank pagamento no débito", banco.transacao());
    }
}