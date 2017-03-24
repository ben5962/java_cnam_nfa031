package variablestableauxboucles;

import static variablestableauxboucles.UtilitaireBooleens.TrueIfSameTruthValue;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
import static variablestableauxboucles.UtilitaireEntreesSorties.saisie_entier;
import variablestableauxboucles.UtilitaireChainesCommunes;

public class ExerciceTests_5SigneProduitSansCalculZ extends Exercice {
	BoolIf<Integer> estposit = new EstPositif();
	BoolIf<Integer> estnegat = new EstNegatif();
	
	public ExerciceTests_5SigneProduitSansCalculZ() {
		initialisation_type_exercice();
		initialisation_specifique();
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
		this.setEnnonce_exo("Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe ensuite si le produit est négatif ou positif (on inclut cette fois le traitement du cas où le produit peut être nul). Attention toutefois, on ne doit pas calculer le produit !");

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
