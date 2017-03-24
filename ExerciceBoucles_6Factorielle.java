package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
public class ExerciceBoucles_6Factorielle extends Exercice {

	public ExerciceBoucles_6Factorielle() {
	  initialisation_type_exercice();
	  initialisation_specifique();
	}

	@Override
	public void doit() {
		// il doit etre possible d utiliser reduce avec java8 ou un eqv
		UtilitaireEntreesSorties.afficher_texte("entrer un nombre");
		int saisie = UtilitaireEntreesSorties.saisie_entier();
		int mini = 1;
		int elt_neutre_mult = 1;
		int cpt = mini;
		int maxi = saisie;
		int accu = elt_neutre_mult;
		for (; cpt <= maxi ; cpt++ ){
			accu = accu * cpt;
		}
		UtilitaireEntreesSorties.afficher_texte(Integer.toString(saisie) + "! vaut: " + Integer.toString(accu));
		
	

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle. NB : la factorielle de 8, notée 8 !, vaut 1 x2x3x4 x5x6x7x8");
 this.numero_exercice = "boucles 6";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
