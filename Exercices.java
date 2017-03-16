package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;

import java.util.Arrays;
import java.util.List;

public class Exercices {
	// pt entree du prog 
	// joue les exercices
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ConteneurExercices c = getConteneurexercices();
        //joueChaqueExercice(c);
		ObjetRemplirListeExosFromFileSystem o = new ObjetRemplirListeExosFromFileSystem();
		List<String> listeexos = getListeExercices(o);
		for (String s: listeexos){
			afficher_texte(s);
		}
	}
	
	
	private static List<Exercice> RemplirListeExercicesALaMain(Exercice... Lexos ){
		return Arrays.asList(Lexos);
		
	}
	
	private static ConteneurExercices getConteneurexercices(){
		// renvoie un ensemble iterable d exercices.
		// separe du main pour ajouter tranquillement des exercices dans la liste
		// au fur et à mesure
		List<Exercice> Lexos = RemplirListeExercicesALaMain(
				new ExerciceTableaux6_8NbVal()
				//new ExerciceEstPositif()
				//new ExerciceSommeUnTableau(),
				//new ExerciceSomme2Tableaux()
				//new ExerciceEstPositif()
				//new ExerciceNomsClassesAlpha()
				);
		ConteneurExercices c  = new ConteneurExercices(Lexos);
		return c;
	}
	
	
	private static List<String> getListeExercices(ObjetMethodeRemplissage m){
		List<String> Lfichier = m.trouverListeExos();
		return Lfichier;
	}
	
	private static ConteneurExercices getConteneurexercices(ObjetMethodeRemplissage m ){
		// renvoie un ensemble iterable d exercices.
		// separe du main pour ajouter tranquillement des exercices dans la liste
		// au fur et à mesure
		List<Exercice> Lexos = m.remplirListeExos();
		ConteneurExercices c  = new ConteneurExercices(Lexos);
		return c;
	}
	
	
	private static void joueChaqueExercice(ConteneurExercices c){
	    //  copie collé d internet sur les iterateurs
		// pour ConteneurExercices
		// pour essayer le "newstyle for"..
		// et pour rajouter des champs commentaires sans avoir à lire 50k lignes 
		for (Exercice exo : c){
			afficher_texte("numero exercice:");
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
