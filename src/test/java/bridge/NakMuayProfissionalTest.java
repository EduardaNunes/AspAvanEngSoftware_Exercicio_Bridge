package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuayProfissionalTest {

    @Test
    void devePremiarComPesoPenaSemHistorico() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        assertEquals(300.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoPesadoEHistoricoPositivo() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        nakMuay.setVitorias(8);
        nakMuay.setNocautes(3);
        nakMuay.setDerrotas(2);
        assertEquals(740.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoMedioEDerrotasReduzindoBonus() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoMedio());
        nakMuay.setVitorias(1);
        nakMuay.setDerrotas(5);
        assertEquals(428.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

}