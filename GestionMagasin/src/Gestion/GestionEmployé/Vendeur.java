package Gestion.GestionEmployé;

public class Vendeur extends Employe {
    private int tauxdevente;

    public Vendeur(int id,String nom,String adresse,double nombreheures, int tauxdevente){
        super(id,nom,adresse,nombreheures);
        this.tauxdevente= tauxdevente;
    }

    @Override
    public String toString() {
        return super.toString() + "Type employe est ;Vendeur" +
                "tauxdevente=" + tauxdevente +
                '}';
    }

    public double calculersalaire(){
        return 450* this.tauxdevente;
    }
}
