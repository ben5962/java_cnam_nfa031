package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
public class ExerciceBoucles_7PlusGdNbPosit extends Exercice {

	public ExerciceBoucles_7PlusGdNbPosit() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		int indice_mini = 1;
		int indice_maxi = 20;
		int accu_indice = indice_mini;
		int accu_valeur_max = 0;
		int cpt = indice_mini;
		for (; cpt <= indice_maxi; cpt++){
			UtilitaireEntreesSorties.afficher_texte("saisir nombre " + Integer.toString(cpt) + "/" + Integer.toString(indice_maxi));
			int saisie = UtilitaireEntreesSorties.saisie_entier();
			if (saisie > accu_valeur_max){
				accu_valeur_max = saisie;
				accu_indice = cpt;
			}
		}
		UtilitaireEntreesSorties.afficher_texte("le max vaut : " + String.valueOf(accu_valeur_max) + " " + "� l indice :" + String.valueOf(accu_indice));

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande successivement 20 nombres � l�utilisateur, et qui lui dise ensuite quel �tait le plus grand parmi ces 20 nombres : Entrez le nombre num�ro 1 : 12 Entrez le nombre num�ro 2 : 14 etc. Entrez le nombre num�ro 20 : 6 Le plus grand de ces nombres est : 14 Modifiez ensuite l�algorithme pour que le programme affiche de surcro�t en quelle position avait �t� saisie ce nombre : C��tait le nombre num�ro 2");

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
