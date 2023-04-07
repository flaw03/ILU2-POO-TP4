package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{

    private int poids;
    private Gaulois chasseur;

    public Sanglier(int poids,Gaulois chasseur){

        super("sanglier",Unite.KILOGRAMME);
        this.chasseur = chasseur;
        this.poids = poids;
    }

    public String description(){
        return super.getNom() + " de " + poids + " kg chassé par " + chasseur.getNom();
    }
}
