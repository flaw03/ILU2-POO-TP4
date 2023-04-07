package produit;

public class Poisson extends Produit {
    private String date;

    public Poisson(String date){
        super("Poisson",Unite.PAR_PIECE);
        this.date = date;
    }

    public String description (){
        return super.getNom() + " pêchés " + date;
    }

}

