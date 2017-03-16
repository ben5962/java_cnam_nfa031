package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
import variablestableauxboucles.UtilitaireChainesCommunes;

public class ExerciceBoucles_2NombreCorrectGuide extends Exercice {

	private int BORNE_MIN = 10;
	private int BORNE_MAX = 20;
	
	public ExerciceBoucles_2NombreCorrectGuide() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doit() {
	
	int  nb;
		do {
		UtilitaireEntreesSorties.afficher_texte(
				UtilitaireChainesCommunes.demande_saisie_nombre);
		nb = UtilitaireEntreesSorties.saisie_entier();
			if (nb < this.BORNE_MIN){
				UtilitaireEntreesSorties.afficher_texte(
						UtilitaireChainesCommunes.trop_petit); 
			}
		if (nb > this.BORNE_MAX){
			UtilitaireEntreesSorties.afficher_texte(
					UtilitaireChainesCommunes.trop_grand);
			}
				}
		while(nb_pas_dans_les_clous(nb));

	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub

	}
	
	private boolean nb_pas_dans_les_clous(int i){
	
	return (i < this.BORNE_MIN || i > this.BORNE_MAX);
	 
	
	}


}
