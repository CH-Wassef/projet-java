package Test;

import Entite.Produit;
import Gestion.GestionEmployé.Caissier;
import Gestion.GestionEmployé.Responsable;
import Gestion.GestionEmployé.Vendeur;
import Gestion.Magasin;
import TestEncapsulation.Package2.C;

import java.util.Date;
public class Test {

    public static  void main(String [] arg )
    {
        Produit p1=new Produit();

        System.out.println("identifiant :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());
        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

        Produit p2=new Produit(1024,"Delice","Lait");
        System.out.println("Entite.Produit 2");
        System.out.println("identifiant :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());
        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        System.out.println("Entite.Produit 3");
        System.out.println("identifiant :"+p3.getIdentifiant());
        System.out.println("marque :"+p3.getMarque());
        System.out.println("libelle :"+p3.getLibelle());
        System.out.println("prix :"+p3.getPrix());
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f );

        ;

        System.out.println("afficher");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        p1.setMarque("Delice");
        System.out.println("to String");

        System.out.println(p1.toString());
        System.out.println(p1);

        System.out.println(p2.toString());

        System.out.println(p2);
        Date d1=new Date();
        p2.setDateexp(d1);
        System.out.println("to String");
        System.out.println(p2.toString());
        System.out.println(p2);
         p2.afficher();
        Produit p5=new Produit(12,"delic",d1);
        System.out.println(p5);

        Magasin m1=new Magasin();
        Magasin m2=new Magasin(1,"tunis");
        m1.ajouter(p1);
        m1.ajouter(p2);
        System.out.println("Gestion.Magasin");
        m1.afficher();

        m1.ajouter(p5);
        System.out.println(p1.comparer(p2));

        System.out.println(Produit.comparer(p2,p5));

        System.out.println("test ajout");
        m1.ajouter(p5);

        System.out.println("Plus Produit");

        Magasin m=m1.plusProduit(m2);
        m.afficher();

        System.out.println(m1.plusProduit(m2));


        System.out.println(Magasin.plusProduit(m1,m2));

        System.out.println(m1.supprimer(p5));

        System.out.println("Caissier");
        Caissier c1= new Caissier(1, "wassef", "lagoullete", 20, 10);
        Caissier c2= new Caissier(2, "imeed","sousse",30,15);



        System.out.println("Vendeur");
        Vendeur v1= new Vendeur(1,"khalil","nabeul",15,15);
        Vendeur v2= new Vendeur(2,"feres","kram",15,15);
        Vendeur v3= new Vendeur(3,"touta","khaireddine",15,15);

        Responsable r1 = new Responsable(1,"monji","marsa0",20,120);

        Magasin m3 = new Magasin(1,"magasinbeji");
        m3.ajouter(p3);
        m3.ajouter(p4);
        m3.ajouteremploye(c1);
        m3.ajouteremploye(c2);
        m3.afficher();
        System.out.println(r1.calculersalaire());
        System.out.println(c1.calculersalaire());
        System.out.println(c2.calculersalaire());



    }

}
