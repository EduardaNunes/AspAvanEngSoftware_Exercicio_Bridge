package bridge;

public class NakMuayProfissional extends NakMuay {

    public NakMuayProfissional(float premiacaoBase){
        super(premiacaoBase);
    }

    public float calcularPremiacao() {
        return this.premiacaoBase * (1 + this.categoriaPeso.percentualBonusCategoria() + this.calcularBonusDesempenho());
    }

}
