package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuayAmadorTest {

    @Test
    void devePremiarComValorBaseIndependenteDeCategoriaEDesempenho() {
        NakMuayAmador nakMuay = new NakMuayAmador(500.0f);
        nakMuay.setCategoriaPeso(new PesoPesado());
        nakMuay.setVitorias(10);
        nakMuay.setNocautes(5);
        nakMuay.setDerrotas(0);
        assertEquals(500.0f, nakMuay.calcularPremiacao(), 0.01f);
    }

}