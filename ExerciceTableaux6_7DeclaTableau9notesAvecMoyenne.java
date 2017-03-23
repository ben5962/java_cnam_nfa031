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
		this.setEnnonce_exo("Ecrivez la fin de l’algorithme 6.3 afin que le calcul de la moyenne des notes soit effectué et affiché à l’écran.");
		this.commentaire_implementation = "repérage des modifs par blocs nommés.\n"
				+ "pour l instant pour modifier un bloc de code je n ai trouvé ds la litt que:\n"
				+ "la gestion de version\n"
				+ "le polymorphisme ad hoc (1 TRUC) (f mm nom classes diff ACTIONS DIFFERENTES\n"
				+ " = surch opé +) pour ADDITION OU POUR CONCATENATION\n"
				+ "polymorphisme universel (2+ TRUCS)/ poly paramétrique:\n "
				+ "un objet N fonctions MEME ROLE SIGNATURE DIFFERENTE\n"
				+ "(en nombre ou et/ou en type)\n"
				+ "role de la signature détermine la fonction appelée\n"
				+ "polymorphisme universel/poly d héritage :\n"
				+ "- les objets fils appartenant à une hierarchie logique\n" 
				+ "redefinissent une méthode cf doit()\n"
				+ "ici je repère le code avec un bloc nommé pour relecture plus tard\n"
				+ "je vais essayer dans exos suivants de regrouper les ACTIONS dans des cl\n"
				+ "séparées et de spécialiser le code spécifique (voir ct possible)";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub

	}

}
