package variablestableauxboucles;

public class ExerciceTableaux6_9SommeUnTableau extends Exercice {

	public ExerciceTableaux6_9SommeUnTableau() {
		// TODO Auto-generated constructor stub
		
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	
	public void doit() {
		int tab[] = {1,2,3};
		// TODO Auto-generated method stub
       int indice_mini = 0;
       int indice_maxi = indice_mini + tab.length - 1;
       int indice_courant = indice_mini;
       int accumulateur = 0;
       for (;indice_courant <= indice_maxi; indice_courant++ ){
    	   accumulateur = tab[indice_courant] + accumulateur;
       }
       System.out.println("la somme des elements du tableau : " + String.valueOf(tab) + "vaut: " + String.valueOf(accumulateur) );
       
	}


	@Override
	public void initialisation_type_exercice() {
		setEnnonce_exo("Ecrivez un algorithme calculant la somme des valeurs d�un tableau (on suppose que le tableau a �t� pr�alablement saisi).");
		
this.numero_exercice = "tableaux 6.9";
this.interet_exo = "parcours de tableau. accumulateur\n"
		+ "declaration explicite de tableaux\n"
		+ "essai de la repr�sentation sous forme de chaine d un objet";

	}


	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
