package variablestableauxboucles;

public class ExerciceTableaux6_7DeclaTableau9notesAvecMoyenne extends Exercice {

	public ExerciceTableaux6_7DeclaTableau9notesAvecMoyenne() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrivez la fin de l�algorithme 6.3 afin que le calcul de la moyenne des notes soit effectu� et affich� � l��cran.");
		this.commentaire_implementation = "rep�rage des modifs par blocs nomm�s.\n"
				+ "pour l instant pour modifier un bloc de code je n ai trouv� ds la litt que:\n"
				+ "la gestion de version\n"
				+ "le polymorphisme ad hoc (1 TRUC) (f mm nom classes diff ACTIONS DIFFERENTES\n"
				+ " = surch op� +) pour ADDITION OU POUR CONCATENATION\n"
				+ "polymorphisme universel (2+ TRUCS)/ poly param�trique:\n "
				+ "un objet N fonctions MEME ROLE SIGNATURE DIFFERENTE\n"
				+ "(en nombre ou et/ou en type)\n"
				+ "role de la signature d�termine la fonction appel�e\n"
				+ "polymorphisme universel/poly d h�ritage :\n"
				+ "- les objets fils appartenant � une hierarchie logique\n" 
				+ "redefinissent une m�thode cf doit()\n"
				+ "ici je rep�re le code avec un bloc nomm� pour relecture plus tard\n"
				+ "je vais essayer dans exos suivants de regrouper les ACTIONS dans des cl\n"
				+ "s�par�es et de sp�cialiser le code sp�cifique (voir ct possible)";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub

	}

}
