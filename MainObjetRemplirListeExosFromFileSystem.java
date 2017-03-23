package variablestableauxboucles;

import java.util.ArrayList;
import java.util.List;
import variablestableauxboucles.MainIOBaladeDansSystemeFichiers;

public class MainObjetRemplirListeExosFromFileSystem extends MainObjetMethodeRemplissage {

	public MainObjetRemplirListeExosFromFileSystem() {
		// TODO Auto-generated constructor stub
	}
    
	
	
//	@Override
//	public List<Exercice> remplirListeExos() {
//		// TODO eventuellement implementer remplirlisteexos() de ObjetRemplirListeExosFromfileSystem
//		// SHAME pompé honteusement de https://docs.oracle.com/javase/tutorial/essential/io/find.html
//		// SHAME de même http://tutorials.jenkov.com/java-nio/files.html#files-walkfiletree
//		// INTERESSANT : la redéfinition d une partie du corps pendant l invocation
//		// déjà rencontrée (et pas comprise) pendant une lecture de cours tdd sur mockito
//		
//		return new ArrayList<Exercice>();
//	}



	@Override
	public List<String> trouverListeExos() {
		// TODO Auto-generated method stub
		MainIOBaladeDansSystemeFichiers balade = new MainIOBaladeDansSystemeFichiers("Exercice[A-Z]*.java", ".git");
		//UtilitaireIOBaladeDansSystemeFichiers balade = new UtilitaireIOBaladeDansSystemeFichiers("*", ".git");
		List<String> LExos = balade.GetListeNomsFichiersRespectantPattern();
		// DONE bug des globs : "s" == "S"! du coup Exercices est inclus.
		//LExos.remove(LExos.indexOf("Exercices"));

		// besoin d une methode pour générer auto l uml de familles d'utilitaires:
		// sans "plan", je m'y perds.
		// le générer à la main est une perte de temps.
		return LExos;
	}

}
