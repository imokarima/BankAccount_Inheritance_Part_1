package entreprise;

public class Paie {
    public static void main(String[] args) {
        Employes_30 e=new Employes_30("A",60,1000);
        Employes_50 e1=new Employes_50("B",40,1300);
        System.out.println(e.salaire);
        System.out.println(e.toString());
        System.out.println(e1.salaire);
        System.out.println(e1.toString());
    }

}
