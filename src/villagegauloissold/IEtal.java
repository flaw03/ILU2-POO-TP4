package villagegauloissold;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {
    boolean isEtalOccupe();

    Gaulois getVendeur();

    int getQuantite();

    String getProduit();

    void tal(Gaulois vendeur, Produit produit, int quantite);

    boolean contientProduit(String produit);

    int acheterProduit(int quantiteAcheter);

    void libererEtal();

    String[] etatEtal();
}
