package Gestion.GestionEmployé;

import java.util.Objects;

public class Employe {
    private int identifiant;
    private String nom;

    private String adresse;

    private double nombreheures;


    public Employe(int identifiant, String nom, String adresse, double nombreheures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nombreheures = nombreheures;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getNombreheures() {
        return nombreheures;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNombreheures(double nombreheures) {
        this.nombreheures = nombreheures;
    }

    public String toString(){
        return "Employé{"+
                "identifiant=" + identifiant +
                "nom=" + nom +
                "adresse=" + adresse +
                "nombreheures=" + nombreheures +'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(identifiant, employe.identifiant) && Objects.equals(nom, employe.nom);
    }
    public double calculersalaire(){
        return 0;
    }
}

