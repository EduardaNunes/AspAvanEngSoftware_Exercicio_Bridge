package bridge;

public class NakMuay {

    private Divisao divisao;

    private int vitorias;
    private int nocautes;
    private int derrotas;

    public void setVitorias(int newVitorias){
        this.vitorias = newVitorias;
    }

    public void setNocautes(int newNocautes){
        this.vitorias = newNocautes;
    }

    public void setDerrotas(int newDerrotas){
        this.vitorias = newDerrotas;
    }

    public float calcularBonusDesempenho() {
        return (this.vitorias * 0.02f) + (this.nocautes * 0.03f) - (this.derrotas * 0.01f);
    }

}