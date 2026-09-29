package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuayProfissionalTest {

    @Test
    void devePremiarComPesoPenaSemHistorico() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        assertEquals(100.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoMedioSemHistorico() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoMedio());
        assertEquals(110.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComPesoPesadoSemHistorico() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        assertEquals(120.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComVitoriasIsoladas() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        nakMuay.setVitorias(5);
        assertEquals(110.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComNocautesIsolados() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        nakMuay.setNocautes(4);
        assertEquals(112.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarComDerrotasIsoladasReduzindoBonus() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        nakMuay.setDerrotas(6);
        assertEquals(94.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarCombinandoVitoriasNocautesEDerrotas() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPena());
        nakMuay.setVitorias(5);
        nakMuay.setNocautes(4);
        nakMuay.setDerrotas(6);
        assertEquals(116.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

    @Test
    void devePremiarCombinandoCategoriaEDesempenho() {
        NakMuayProfissional nakMuay = new NakMuayProfissional(100.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        nakMuay.setVitorias(8);
        nakMuay.setNocautes(3);
        nakMuay.setDerrotas(2);
        assertEquals(143.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

}