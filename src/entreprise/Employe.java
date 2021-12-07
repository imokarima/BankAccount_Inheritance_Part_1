package entreprise;

public class Employe {
    private String name;
    protected double salaire;


    public Employe(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return "L'employe "+this.name+"";
    }
}
