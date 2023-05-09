public class Coffre {

    public int Or;
    public int Bois;
    public int Pierre;
    public int Nourriture;


    public Coffre(int or, int bois, int pierre, int nourriture) {
        Or = or;
        Bois = bois;
        Pierre = pierre;
        Nourriture = nourriture;
    }


    @Override
    public String toString() {
        return "Coffre [Or=" + Or + ", Bois=" + Bois + ", Pierre=" + Pierre + ", Nourriture=" + Nourriture + "]";
    }


}
