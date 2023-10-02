import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoBradescoTest {
    @Test
    void deveRetornarBancoItauViaPix() {
        Pagamento tipoPagamento = new Pix();
        BancoBradesco banco = new BancoBradesco(tipoPagamento);
        assertEquals("Banco Bradesco pagamento no pix", banco.transacao());
    }

    @Test
    void deveRetornarBancoItauViaCredito() {
        Pagamento tipoPagamento = new Credito();
        BancoBradesco banco = new BancoBradesco(tipoPagamento);
        assertEquals("Banco Bradesco pagamento no crédito", banco.transacao());
    }

    @Test
    void deveRetornarBancoItauViaDebito() {
        Pagamento tipoPagamento = new Debito();
        BancoBradesco banco = new BancoBradesco(tipoPagamento);
        assertEquals("Banco Bradesco pagamento no débito", banco.transacao());
    }
}