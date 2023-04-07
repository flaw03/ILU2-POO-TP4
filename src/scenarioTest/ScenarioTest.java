package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;


public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};


		Etal<Sanglier> etal1 = new Etal<>();
		Etal<Sanglier> etal2 = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		etal1.installerVendeur(obelix,sangliersObelix,8);
		etal2.installerVendeur(asterix,sangliersAsterix,10);
		etalPoisson.installerVendeur(ordralfabetix,poissons,7);

		System.out.println(etal1.etalEtal());
		System.out.println(etal2.etalEtal());
		System.out.println(etalPoisson.etalEtal());

		System.out.println(etal1.acheterProduit(1));
		System.out.println(etal2.acheterProduit(2));


		System.out.println(etal1.etalEtal());
		System.out.println(etal2.etalEtal());



	}
	
}
