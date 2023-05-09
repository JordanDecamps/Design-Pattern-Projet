import java.util.ArrayList;

public class Coffre {

    public ArrayList<Ressources> ressources;

    public Coffre(ArrayList<Ressources> ressources) {
        this.ressources = ressources;
    }

    @Override
    public String toString() {
        return "Coffre [ressources=" + ressources + "]";
    }

}
