package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuaySemiProfissionalTest {

    @Test
    void devePremiarComPesoPenaSemHistorico() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        assertEquals(1000.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoMedioEHistoricoPositivo() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoMedio());
        nakMuay.setVitorias(3);
        nakMuay.setNocautes(1);
        nakMuay.setDerrotas(1);
        assertEquals(1180.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoPesadoEDerrotasReduzindoBonus() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        nakMuay.setDerrotas(4);
        assertEquals(1210.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

}