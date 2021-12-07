package entreprise;

public class Commerciaux extends Employe{
    private int nbHeure;
    private double chiffreAffaire;

    public Commerciaux(String name) {
        super(name);
    }

    public Commerciaux(String name,int nbHeure, double chiffreAffaire) {
        super(name);
        this.salaire=500;
        this.nbHeure = nbHeure;
        this.chiffreAffaire = chiffreAffaire;
    }
    public double setInfoSalaire(){
        return this.salaire+=0.01*this.chiffreAffaire;
    }

    public String toString(){
        return super.toString()+" a fait :"+this.nbHeure+" avec un chiffre d'affaire :"+this.chiffreAffaire+" et un salaire de :"+this.setInfoSalaire();
    }
}
