package variablestableauxboucles;

import static variablestableauxboucles.UtilitaireBooleens.TrueIfSameTruthValue;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
import static variablestableauxboucles.UtilitaireEntreesSorties.saisie_entier;
import variablestableauxboucles.UtilitaireChainesCommunes;

public class ExerciceTests_5SigneProduitSansCalculZ extends Exercice {
	BoolIf<Integer> estposit = new EstPositif();
	BoolIf<Integer> estnegat = new EstNegatif();
	
	public ExerciceTests_5SigneProduitSansCalculZ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		afficher_texte(UtilitaireChainesCommunes.demande_saisie_nombre);
		int i = saisie_entier();
		afficher_texte(UtilitaireChainesCommunes.demande_saisie_nombre);
		int j = saisie_entier();
		// tous deux strictements positifs ou strictement négatifs? 
		//  vrai => produit positif
		//  faux => produit negatif ou nul
		boolean Truth = TrueIfSameTruthValue(i,j,this.estposit);
        if (Truth){afficher_texte(UtilitaireChainesCommunes.resultat_positif);}
        else{ 
        	// l un des deux est soit de signe différent soit nul.
        	// on vire le cas "est de signe différent" (on aurait pu faire l autre)
        	boolean Truth2 = ((i < 0 && j > 0) || (i > 0 && j < 0));
        	if (Truth2){afficher_texte(UtilitaireChainesCommunes.resultat_negatif);}
        	else {afficher_texte(UtilitaireChainesCommunes.nombre_nul);}
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
