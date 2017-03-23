package variablestableauxboucles;

public class ExerciceTableaux_4GuessWhatItDoes1 extends Exercice {

	public ExerciceTableaux_4GuessWhatItDoes1() {
		
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
  blocA : {}
  blocB: {}
	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.setEnnonce_exo("Que produit l’algorithme suivant ? Tableau Nb(5) en Entier Variable i en Entier Début Pour i 0 à 5 Nb(i) i * i i suivant Pour i 0 à 5 Ecrire Nb(i) i suivant Fin Peut-on simplifier cet algorithme avec le même résultat ?");
		this.numero_exercice = "bableaux exo4";
		this.commentaire_implementation = "permet de jouer avec les blocs\n"
				+ "apparement utilisés normalement comme label pour des breaks\n"
				+ "à la GOTO. factorisation du code.";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
