package variablestableauxboucles;

public class ExerciceTableaux6_6GuessWhatItDoes3Fibo extends Exercice {

	public ExerciceTableaux6_6GuessWhatItDoes3Fibo() {
		// TODO Auto-generated constructor stub
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_type_exercice() {
		setEnnonce_exo("Que produit l’algorithme suivant ? Tableau Suite(7) en Entier Variable i en Entier Début Suite(0) 1 Suite(1) 1 Pour i 2 à 7 Suite(i) Suite(i-1)+Suite(i-2) i suivant Pour i 0 à 7 Ecrire Suite(i) i suivant Fin");
		this.numero_exercice = "tableaux 6.6";
		this.interet_exo = "identifier un algo connu";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
