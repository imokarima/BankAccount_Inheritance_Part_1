package entreprise;

public class Employes_30 extends Employe{
    private int nbHeure;
    private double chiffreAffaire;
    private double tarifHorraire=10;
    public Employes_30(String name) {
        super(name);
    }

    public Employes_30(String name,int nbHeure, double chiffreAffaire) {
        super(name);
        this.salaire=450;
        this.nbHeure = nbHeure;
        this.chiffreAffaire = chiffreAffaire;
    }
    public double setInfoSalaire(){
        if(nbHeure>40){
           double prixHSup= this.tarifHorraire*(this.nbHeure-40);
                  return this.salaire+=prixHSup*0.3;
        }
        return salaire;
    }
    public String toString(){
        return super.toString()+" a fait :"+this.nbHeure+" avec un chiffre d'affaire :"+this.chiffreAffaire+" et un salaire de :"+this.setInfoSalaire();
    }
}
