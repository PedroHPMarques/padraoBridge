import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoItauTest {
    @Test
    void deveRetornarBancoItauViaPix() {
        Pagamento tipoPagamento = new Pix();
        BancoItau banco = new BancoItau(tipoPagamento);
        assertEquals("Banco Itaú pagamento no pix", banco.transacao());
    }

    @Test
    void deveRetornarBancoItauViaCredito() {
        Pagamento tipoPagamento = new Credito();
        BancoItau banco = new BancoItau(tipoPagamento);
        assertEquals("Banco Itaú pagamento no crédito", banco.transacao());
    }

    @Test
    void deveRetornarBancoItauViaDebito() {
        Pagamento tipoPagamento = new Debito();
        BancoItau banco = new BancoItau(tipoPagamento);
        assertEquals("Banco Itaú pagamento no débito", banco.transacao());
    }
}