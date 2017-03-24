package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
import variablestableauxboucles.UtilitaireChainesCommunes;


public class ExerciceBoucles_3BoucleParam extends Exercice {

	public ExerciceBoucles_3BoucleParam() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		UtilitaireEntreesSorties.afficher_texte("saisir nombre");
		int nbsaisi = UtilitaireEntreesSorties.saisie_entier();
		int mini = nbsaisi + 1;
		int maxi = nbsaisi + 10;
		int cpt = mini;
		for(; cpt <= maxi; cpt++){
			UtilitaireEntreesSorties.afficher_texte(String.valueOf(cpt));
		}

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.");
       this.numero_exercice = "boucles 3";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
