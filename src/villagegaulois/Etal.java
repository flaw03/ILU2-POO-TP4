package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;
import produit.Produit;

public class Etal <P extends IProduit> implements IEtal {
    private Gaulois vendeur;
    private P[] produits;
    private int nbrProduit;
    private int prix;

    public void installerVendeur(Gaulois vendeur,P[] produit,int prix) {
        this.vendeur = vendeur;
        this.produits = produit;
        this.prix = prix;
        this.nbrProduit = produit.length;
    }

    @Override
    public Gaulois getVendeur() {
        return vendeur;
    }

    @Override
    public double donnerPrix() {
        return prix;
    }

    @Override
    public int contientProduit(String produit, int quantiteSouhaitee) {
        int quantiteAvendre = 0;
        if(nbrProduit != 0 && this.produits[0].getNom().equals(produit)){
            if (nbrProduit >= quantiteSouhaitee){
                quantiteAvendre = quantiteSouhaitee;
            }else {
                quantiteAvendre = nbrProduit;
            }
        }
        return quantiteAvendre;
    }

    @Override
    public double acheterProduit(int quantiteSouhaitee) {
        double prixPaye = 0;
        for (int i = nbrProduit - 1; i > nbrProduit - quantiteSouhaitee - 1 || i > 1; i--) {
            prixPaye += produits[i].calculerPrix(prix);
        }
        if (nbrProduit >= quantiteSouhaitee) {
            nbrProduit -= quantiteSouhaitee;
        } else {
            nbrProduit = 0;
        }
        return prixPaye;
    }

    @Override
    public String etalEtal() {
        StringBuilder chaine = new StringBuilder(vendeur.getNom());
        if (nbrProduit > 0) {
            chaine.append("  vend ");
            chaine.append(nbrProduit + " produit : ");
            for (int i = 0; i<nbrProduit;i++){
                chaine.append("\n- " + produits[i].description());
            }
        } else {
            chaine.append(" n'a plus rien à vendre.");
        }
        chaine.append("\n");
        return chaine.toString();
    }


}
