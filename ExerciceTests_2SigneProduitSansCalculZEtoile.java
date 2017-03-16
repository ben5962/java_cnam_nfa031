package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;
import static variablestableauxboucles.UtilitaireBooleens.*;


public class ExerciceTests_2SigneProduitSansCalculZEtoile extends Exercice {
    
	BoolIf<Integer> estposit = new EstPositif();
	String demander_entier;
	String produit_positif;
	String produit_negatif;
	
	public ExerciceTests_2SigneProduitSansCalculZEtoile() {
		// TODO Auto-generated constructor stub
		initialisation_type_exercice();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		afficher_texte(this.demander_entier);
		int i = saisie_entier();
		afficher_texte(this.demander_entier);
		int j = saisie_entier();
		boolean Truth = TrueIfSameTruthValue(i,j,this.estposit);
        if (Truth){afficher_texte(produit_positif);}
        else{afficher_texte(produit_negatif);}
	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.numero_exercice = "exercice 2";
		this.interet_exo = "opérations exotiques sur les booléens : XNOR!( ^)\n"
				+ "| the OR operator\n"
				+ "& the AND operator\n"
				+ "^ the XOR operator\n"
				+ "! the NOT operator\n"
				+ "|| the short-circuit OR operator\n"
				+ "&& the short-circuit AND operator\n"
				+ "== the EQUAL TO operator\n"
				+ "!= the NOT EQUAL TO operator ";
		this.demander_entier = "saisissez un entier\n";

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		this.produit_negatif = "le produit est négatif";
		this.produit_positif = "le produit est positif";
		
	}

}
