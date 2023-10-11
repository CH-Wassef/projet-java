package Gestion;

import Entite.Produit;
import Gestion.GestionEmployé.Employe;
import Gestion.GestionEmployé.Responsable;

import java.util.ArrayList;

public class Magasin {
    private int identifiant;
    private String adresse;

    private String emplacement;

    private static final int CAPACITE_PR = 50;

    private Produit[] tabprod = new Produit[CAPACITE_PR];

    private Employe[] tabEmploye = new Employe[20];

    private int nombreEmploye;

    private int comp;
    private static int totalPr;
    private static int totalEmploye;


    public Magasin() {
    }

    public Magasin(int id, String ad) {
        this.identifiant = id;
        adresse = ad;
    }


    public void ajouter(Produit p) {
        if (chercherPro(p) == false) {
            if (comp < CAPACITE_PR) {
                tabprod[comp] = p;
                comp++;
                totalPr++;
            } else {

                System.out.println("Magasin plein");
            }
        } else {

            System.out.println("le produit existe");
        }
    }

    public void ajouteremploye(Employe E) {
        if (comp < 20) {
            tabEmploye[nombreEmploye] = E;
            nombreEmploye++;
            totalEmploye++;
            comp++;
            totalPr++;
        }
    }

    public void afficher() {
        System.out.println("id :" + identifiant + "adresse :" + adresse);

        /*for (Entite.Produit p:tabprod) {
            if(p!=null)
            p.afficher();
        }*/
        for (int i = 0; i < comp; i++)
            if(tabEmploye[i] != null)
            tabprod[i].afficher();
        for (int i = 0; i < comp; i++)
            if(tabEmploye[i] != null)
            tabEmploye[i].toString();
    }
    public void afficheSalaires() {
        System.out.println("Salaires de tous les employés dans le magasin :");
        for (Employe employe : tabEmploye) {
            System.out.println(employe.getNom() + " : " + employe.calculersalaire());
        }
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean chercherPro(Produit p) {

        for (int i = 0; i < comp; i++) {
            if (Produit.comparer(p, tabprod[i]))
                return true;
        }
        return false;
    }

    public Magasin plusProduit(Magasin m1) {

        if (this.comp > m1.comp)
            return this;
        else if (this.comp < m1.comp)
            return m1;
        return null;
    }

    public static Magasin plusProduit(Magasin m1, Magasin m2) {

        if (m2.comp > m1.comp)
            return m2;
        else if (m2.comp < m1.comp)
            return m1;
        return null;
    }



    public String toString() {
        String emp = "L'ensemble des employes :\n";
        String str = "L'ensemble des produits :\n";

        for (int i = 0; i < comp; i++)
            str += tabprod[i] + "\n";

        for (int i = 0; i < comp; i++)
            emp += tabEmploye[i] + "\n";

        return "identifiant" + identifiant + "adresse " + adresse + str + emp;
    }

    public int search(Produit p) {

        for (int i = 0; i < comp; i++) {
            if (p.comparer(tabprod[i]))
                return i;
        }
        return -1;
    }

    public boolean supprimer(Produit p) {

        int indic = search(p);
        if (indic == -1) return false;
        for (int i = indic; i < comp; i++)
            tabprod[i] = tabprod[i + 1];
        tabprod[comp] = null;
        comp--;
        return true;
    }

    public void affichePrimeResponsable() {
        System.out.println("Primes des responsables dans le magasin :");
        for (Employe employe : tabEmploye) {
            if (employe instanceof Responsable) {
                Responsable responsable = (Responsable) employe;
                System.out.println(responsable.getNom() + " : " + responsable.getPrime());
            }
        }
    }

    public void afficheNombreEmployesParType() {
        int nombreEmployesNormaux = 0;
        int nombreResponsables = 0;

        for (Employe employe : tabEmploye) {
            if (employe instanceof Responsable) {
                nombreResponsables++;
            } else {
                nombreEmployesNormaux++;
            }
        }
        System.out.println("Nombre d'employés normaux : " + nombreEmployesNormaux);
        System.out.println("Nombre de responsables : " + nombreResponsables);
    }
}