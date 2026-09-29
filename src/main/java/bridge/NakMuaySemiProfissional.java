package bridge;

public class NakMuaySemiProfissional extends NakMuay {

    public NakMuaySemiProfissional(float premiacaoBase){
        super(premiacaoBase);
    }

    public float calcularPremiacao() {
        return this.premiacaoBase * (1 + this.categoriaPeso.percentualBonusCategoria());
    }

}
