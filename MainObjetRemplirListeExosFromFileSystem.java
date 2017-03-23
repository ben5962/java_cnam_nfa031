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
//		// SHAME pomp� honteusement de https://docs.oracle.com/javase/tutorial/essential/io/find.html
//		// SHAME de m�me http://tutorials.jenkov.com/java-nio/files.html#files-walkfiletree
//		// INTERESSANT : la red�finition d une partie du corps pendant l invocation
//		// d�j� rencontr�e (et pas comprise) pendant une lecture de cours tdd sur mockito
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

		// besoin d une methode pour g�n�rer auto l uml de familles d'utilitaires:
		// sans "plan", je m'y perds.
		// le g�n�rer � la main est une perte de temps.
		return LExos;
	}

}
