package variablestableauxboucles;

public class ExerciceTableaux6_10Somme2Tableaux extends Exercice  {
private int premier_tableau[];
private int second_tableau[];


	public ExerciceTableaux6_10Somme2Tableaux(int tab1[], int tab2[]) {
		// TODO Auto-generated constructor stub
		this.premier_tableau = tab1;
		this.second_tableau = tab2;
		initialisation_type_exercice();
		
	}
	
	public ExerciceTableaux6_10Somme2Tableaux(){
		// this does not seem right mais pas le choix
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		try {
		if (this.premier_tableau.length != this.second_tableau.length){
			UtilitaireProblemeDeTailleDeTableauException tableaux_pas_lg_identique = new UtilitaireProblemeDeTailleDeTableauException("les deux tableaux devraient être de taille identique pour les sommer valeur par valeur");
			throw tableaux_pas_lg_identique;
		}
		// deroulement normal du programme
		int indice_mini = 0;
		int indice_courant = indice_mini;
		int indice_maxi = premier_tableau.length + indice_mini - 1;
		int accumulateur = 0;
		while( indice_courant <= indice_maxi ){
			accumulateur = accumulateur + this.premier_tableau[indice_courant] + this.second_tableau[indice_courant];
			indice_courant = indice_courant + 1;
		}
		System.out.println("la somme des deux tableaux vaut: " + String.valueOf(accumulateur));
		}
	  catch (UtilitaireProblemeDeTailleDeTableauException p){
		  // let the world burn
	  }
	  }

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.interet_exo = "Arrays constants can only be used in initializers error\n"
				+ "ou le rappel sur les 2 manieres d initialiser un tableau: PAR BLOC\n"
				+ "1) le déclarer ET l initialiser:\n"
				+ "<type du tableau> <nom du tableau> [] = { <contenu du tableau>}\n"
				+ "2) le déclarer d abord, bounded ou non PUIS lui affecter une valeur\n"
				+ "int premier_tableau[] ou int premier_tableau[3]\n"
				+ "PUIS ailleurs premier_tableau = new int[]{donnees,...,.}\n"
				+ "mais la séparation de la declaration et de l affectation\n"
				+ "interdit l affectation en un bloc (array initializer)\n"
				+ " + premier essai d exception "
				+ "premiere boucle tant que. ai oublié d inc le cpt=> blce inf";
		this.numero_exercice =  "tableaux 6.10";
	}
	
	


	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		this.premier_tableau = new int[]{1,2,3};
		this.second_tableau = new int[]{4,5,6};
	}

	}


