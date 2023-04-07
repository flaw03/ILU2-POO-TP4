package produit;

public abstract class Produit implements IProduit {
    private String nom;
    private Unite unite;


    public Produit(String nom,Unite unite){
        this.nom = nom;
        this.unite = unite;
    }

    @Override
    public String getNom() {
        return nom;
    }
    @Override
    public double calculerPrix(int prix){
        switch (unite){
            case KILOGRAMME, MILLILITRE:
                return prix /2;
            default:
                return prix;
        }
    }
}