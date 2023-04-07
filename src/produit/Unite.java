package produit;

public enum Unite {


    KILOGRAMME("Kilogramme"),
    GRAMME("Gramme"),
    LITRE("Litre"),
    CENTILITRE ("Centilitre"),
    MILLILITRE("Millilitre"),
    PAR_PIECE("par piece");

    private final String nom;
    Unite(String nom){
        this.nom = nom;
    }



    @Override
    public String toString() {
        return nom;
    }


}
