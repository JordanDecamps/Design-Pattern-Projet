package design.pattern.projet;


public class DecorateurExpertUnite extends Unite{
    protected Unite unite;
    public DecorateurExpertUnite(Unite unite) {
        
        super(unite.vitesse, unite.type, unite.x, unite.y, unite.niveau );
        this.unite=unite;
    }

    @Override
    public int valNouriture(){
        return unite.valNouriture()*2;
    }

    @Override
    public int QuantiteRamassage(){
        return unite.QuantiteRamassage()*2;
    }

}
