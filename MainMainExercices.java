package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;





public class MainMainExercices {
	// responsabilité : lancer les exercices
	
	

	public static void main(String[] args) {
		// justfication : pt entrée du programme
	   MainBDD bdd = new MainBDD();
	   MainConteneurExercices c = bdd.getConteneurExercices("ExerciceBoucles_10TierceSimple");
	  joueChaqueExercice(c);

	}
	
	
/*	private static List<Exercice> RemplirListeExercicesALaMain(Exercice... Lexos ){
		return Arrays.asList(Lexos);
		
	}
	
	private static MainConteneurExercices getConteneurexercices(){
		// renvoie un ensemble iterable d exercices.
		// separe du main pour ajouter tranquillement des exercices dans la liste
		// au fur et à mesure
		List<Exercice> Lexos = RemplirListeExercicesALaMain(
				//new ExerciceTests_1EstPositifNegZEtoile() // ok en f normal (int saisi)
				//new ExerciceTests_3_6CategorieZPlusSupA5() //ok en f normal
				//new ExerciceTests_2SigneProduitSansCalculZEtoile() // ok
				//new ExerciceBoucles_1NombreCorrect()
				new ExerciceBoucles_2NombreCorrectGuide()
				);
		MainConteneurExercices c  = new MainConteneurExercices(Lexos);
		return c;
	}
	
	
	private static List<String> getListeExercices(MainObjetMethodeRemplissage m){
		List<String> Lfichier = m.trouverListeExos();
		return Lfichier;
	}
	
	private static MainConteneurExercices getConteneurexercices(MainObjetMethodeRemplissage m ){
		// renvoie un ensemble iterable d exercices.
		// separe du main pour ajouter tranquillement des exercices dans la liste
		// au fur et à mesure
		List<Exercice> Lexos = m.remplirListeExos();
		MainConteneurExercices c  = new MainConteneurExercices(Lexos);
		return c;
	}*/
	
	
	private static void joueChaqueExercice(MainConteneurExercices c){
	    //  copie collé d internet sur les iterateurs
		// pour ConteneurExercices
		// pour essayer le "newstyle for"..
		// et pour rajouter des champs commentaires sans avoir à lire 50k lignes 
		for (Exercice exo : c){
			afficher_texte("numero exercice:");
			exo.getNomExo();
			exo.getNumero_exercice();
			System.out.println("-------------");
			exo.getEnnonce_exo();
			exo.getInteret_exo();
			exo.getCommentaire_algo();
			exo.getCommentaire_implementation();
			exo.doit();
			System.out.println("fin");
		}
	}
	
   
}
