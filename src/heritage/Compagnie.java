package heritage;

public class Compagnie {

}
class Employ extends Compagnie{
    protected int anciennete = 0;
    protected double salaire;

    public Employ(double salaire) {
        this.salaire = salaire;
    }
}
