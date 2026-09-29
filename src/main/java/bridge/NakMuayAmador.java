package bridge;

public class NakMuayAmador extends NakMuay {

    public NakMuayAmador(float premiacaoBase){
        super(premiacaoBase);
    }

    public float calcularPremiacao() {
        return this.premiacaoBase;
    }
}
