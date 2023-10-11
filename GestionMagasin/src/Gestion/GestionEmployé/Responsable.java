package Gestion.GestionEmployé;

public class Responsable extends Employe {
    private int prime;

    public Responsable(int id,String nom,String adresse,double nombreheures,int prime){
        super(id,nom,adresse,nombreheures);
        this.prime=prime;
    }

    @Override
    public String toString() {
        return super.toString() + "Type employe est ; Responsable {" +
                prime;
    }

    public double calculersalaire(){
        double salaire= 0;
        if(this.getNombreheures() <160){
            salaire = (this.getNombreheures() +10) +this.prime;
        }else {
            salaire = 1600 + prime +((this.getNombreheures()-160*2));
        }
        return salaire;
    }

    public int getPrime() {
        return prime;
    }
}
