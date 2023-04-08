package village;

import produit.Produit;
import villagegaulois.Etal;
import personnages.Gaulois;
import villagegauloissold.DepenseMarchand;

public interface IVillage {
    public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix);
    public DepenseMarchand[] acheterPoduit(String produit, int quantititeSouahaitee);
}
