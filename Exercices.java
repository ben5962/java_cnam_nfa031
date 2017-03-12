package variablestableauxboucles;
import java.util.Arrays;

public class Exercices {
	// pt entree du prog 
	// joue les exercices
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConteneurExercices c = getConteneurexercices();
        joueChaqueExercice(c);
		
	}
	
	
	
	
	private static ConteneurExercices getConteneurexercices(){
		// renvoie un ensemble iterable d exercices.
		// separe du main pour ajouter tranquillement des exercices dans la liste
		// au fur et � mesure
		ConteneurExercices c  = new ConteneurExercices(
				// TODO: 
				// j aimerais que les exercices soit collect�s automatiquement
				// comme classe contenu dans un fichier 
				// nomm� Exercice<UNEMAJ>*.java
				// mais plus tard.... 
				// pour l instant collecte � la main dans une liste: 
				Arrays.asList(
								//new ExerciceNbVal(),
								new ExerciceSommeUnTableau()
							)
		);
		return c;
	}
	
	private static void joueChaqueExercice(ConteneurExercices c){
	    //  copie coll� d internet sur les iterateurs
		// pour ConteneurExercices
		// pour essayer le "newstyle for"..
		// et pour rajouter des champs commentaires sans avoir � lire 50k lignes 
		for (Exercice exo : c){
			exo.getNomExo();
			exo.getNumeroExo();
			System.out.println("-------------");
			exo.getCommentaireEnnonceExo();
			exo.getCommentaireInteretExo();
			exo.getCommentaireAlgo();
			exo.getCommentaireImplementation();
			exo.doit();
			System.out.println("fin");
		}
	}
	
   
}
