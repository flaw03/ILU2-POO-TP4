package villagegaulois;

import personnages.Gaulois;

public class DepenseMarchant implements IEtal{
    @Override
    public Gaulois getVendeur() {
        return null;
    }

    @Override
    public double donnerPrix() {
        return 0;
    }

    @Override
    public int contientProduit(String produit, int quantiteSouhaitee) {
        return 0;
    }

    @Override
    public double acheterProduit(int quantiteSouhaitee) {
        return 0;
    }

    @Override
    public String etalEtal() {
        return null;
    }
}
