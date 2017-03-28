package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
import static variablestableauxboucles.UtilitaireEntreesSorties.saisie_entier;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_tableau;


public class ExerciceTableaux_3DeclaTableau9Notes extends Exercice {
	private int[] t9n = new int[9];

	public ExerciceTableaux_3DeclaTableau9Notes() {
		
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	@Override
	public void doit() {
           afficher_texte("le tableau vaut:");
           afficher_tableau(getT9n());

	}

	@Override
	public void initialisation_type_exercice() {
		setEnnonce_exo("Ecrire un algorithme qui déclare un tableau de 9 notes, dont on fait ensuite saisir les valeurs par l’utilisateur.");
		this.numero_exercice = "tableaux exo 3";
	}

	@Override
	public void initialisation_specifique() {
		this.setT9n();
		
	}

	public int[] getT9n() {
		return t9n;
	}

	public void setT9n() {
		for (int i = 0; i < t9n.length; i++){
			String num_note = String.valueOf(i + 1);
			afficher_texte("saisir note" + num_note + "/" + t9n.length);
			// je peux un élément du tableau parce qu'il a été borné
			// dans la déclaration
			t9n[i] = saisie_entier();
		}
	}

}
