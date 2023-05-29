package design.pattern.projet;



public class DecorateurExpertUnite extends Unite{
    protected Unite unite;
    public DecorateurExpertUnite(Unite unite) {
        
        super(unite.vitesse, unite.type, unite.x, unite.y );
        this.unite=unite;
    }

    @Override
    public int valNouriture(){
        return 2;
    }


}
