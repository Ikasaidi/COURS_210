package heritage;

public class Person {
    protected String prenom;
    protected String nom;

    public Person(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }
}

class Employe extends Person{
    protected String idEmploye;
    protected String titre;

    public Employe(String prenom, String nom, String idEmploye, String titre) {
        super(prenom, nom);
        this.idEmploye = idEmploye;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return this.idEmploye + " : " + super.toString() + " (" + this.titre + ") ";
    }
}
