package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
import static variablestableauxboucles.UtilitaireChainesCommunes.*;
public class ExerciceBoucles_1NombreCorrect extends Exercice {
	private int BORNE_MIN = 1;
	private int BORNE_MAX = 3;

	public ExerciceBoucles_1NombreCorrect() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		int i;
		do {
			UtilitaireEntreesSorties.afficher_texte(demande_saisie_nombre);
			i =  UtilitaireEntreesSorties.saisie_entier();
		} while ( (i > BORNE_MAX || i < BORNE_MIN) );
		

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.");
		

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		//Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

		
	}


}
