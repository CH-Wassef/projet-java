package Gestion.GestionEmployé;

public class Caissier extends Employe {
    private double nombredecaisse;

    public Caissier(int id, String nom, String adresse, double nombreheures, double nombredecaisse) {
        super(id, nom, adresse, nombreheures);
        this.nombredecaisse = nombredecaisse;
        ;
    }

    public double getNombredecaisse() {
        return nombredecaisse;
    }

    @Override
    public String toString() {
        return super.toString() + "Type employe est ; Caissier{" +
                "numerodecaisse" + nombredecaisse +
                '}';
    }

    public double calculersalaire() {
        double salaire = 0;
        if (this.getNombreheures() <= 180) {
            salaire = (this.getNombreheures() * 5);
        } else {
            salaire = 1800 * ((this.getNombredecaisse() - 180) * 1.5);
        }
        return salaire;
    }
}
