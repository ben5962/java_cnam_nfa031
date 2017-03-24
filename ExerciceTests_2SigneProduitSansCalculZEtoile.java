package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;
import static variablestableauxboucles.UtilitaireBooleens.*;
import variablestableauxboucles.UtilitaireTypeContraintEntierNonNul;

public class ExerciceTests_2SigneProduitSansCalculZEtoile extends Exercice {
    
	BoolIf<Integer> estposit = new EstPositif();
	String demander_entier;
	String produit_positif;
	String produit_negatif;
	
	public ExerciceTests_2SigneProduitSansCalculZEtoile() {
		// TODO Auto-generated constructor stub
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		afficher_texte(this.demander_entier);
		UtilitaireTypeContraintEntierNonNul enz = new UtilitaireTypeContraintEntierNonNul();
		enz.set(saisie_entier());
		
		afficher_texte(this.demander_entier);
		UtilitaireTypeContraintEntierNonNul enz2 = new UtilitaireTypeContraintEntierNonNul();
		enz2.set(saisie_entier());
		boolean xor = ((enz.get() > 0) ^ (  enz2.get() > 0 ));
		boolean xnor = ! xor;
		//boolean Truth = xnor;
		boolean Truth = TrueIfSameTruthValue(enz.get(),enz2.get(),this.estposit);
        if (Truth){afficher_texte(produit_positif);}
        else{afficher_texte(produit_negatif);}
	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande deux nombres � l�utilisateur et l�informe ensuite si leur produit est n�gatif ou positif (on laisse de c�t� le cas o� le produit est nul). Attention toutefois : on ne doit pas calculer le produit des deux nombres.");
		// TODO Auto-generated method stub
		this.numero_exercice = "exercice 2";
		this.interet_exo = "op�rations exotiques sur les bool�ens : XNOR!( ^)\n"
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
		this.produit_negatif = "le produit est n�gatif";
		this.produit_positif = "le produit est positif";
		
	}

}
