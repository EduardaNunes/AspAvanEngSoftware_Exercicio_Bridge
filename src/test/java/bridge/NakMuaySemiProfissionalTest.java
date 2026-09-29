package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuaySemiProfissionalTest {

    @Test
    void devePremiarComPesoPena() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        assertEquals(1000.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoMedio() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoMedio());
        assertEquals(1100.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoPesado() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        assertEquals(1200.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarIgnorandoDesempenho() {
        NakMuaySemiProfissional nakMuay = new NakMuaySemiProfissional(1000.0f);
        nakMuay.setCategoriaPeso(new PesoMedio());
        nakMuay.setVitorias(10);
        nakMuay.setNocautes(10);
        nakMuay.setDerrotas(10);
        assertEquals(1100.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

}