package variablestableauxboucles;

import static variablestableauxboucles.UtilitaireBooleens.TrueIfSameTruthValue;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
import static variablestableauxboucles.UtilitaireEntreesSorties.saisie_entier;

public class ExerciceTests_5SigneProduitSansCalculZ extends Exercice {

	public ExerciceTests_5SigneProduitSansCalculZ() {
		// TODO Auto-generated constructor stub
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
        else{ 
        	boolean Truth2 = TrueIfDifferentTruthValue(i,j,this.estnegat);
        	if (Truth2){afficher_texte(produit_negatif);}
        	else {afficher_texte(produit_nul);}
        }

	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
this.numero_exercice = "exercice 4";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
