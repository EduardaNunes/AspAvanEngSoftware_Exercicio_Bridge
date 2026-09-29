package bridge;

public abstract class NakMuay {

    protected CategoriaPeso categoriaPeso;
    protected float premiacaoBase;

    private int vitorias;
    private int nocautes;
    private int derrotas;

    public NakMuay(float premiacaoBase) {
        this.premiacaoBase = premiacaoBase;
    }

    public void setPremiacaoBase(float newPremiacaoBase){
        this.premiacaoBase = newPremiacaoBase;
    }

    public void setCategoriaPeso(CategoriaPeso categoriaPeso) {
        this.categoriaPeso = categoriaPeso;
    }

    public void setVitorias(int newVitorias){
        this.vitorias = newVitorias;
    }

    public void setNocautes(int newNocautes){
        this.nocautes = newNocautes;
    }

    public void setDerrotas(int newDerrotas){
        this.derrotas = newDerrotas;
    }

    public float calcularBonusDesempenho() {
        return (this.vitorias * 0.02f) + (this.nocautes * 0.03f) - (this.derrotas * 0.01f);
    }

    public abstract float calcularPremiacao();

}