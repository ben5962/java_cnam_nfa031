package variablestableauxboucles;

import java.util.List;
import variablestableauxboucles.UtilitaireIOBaladeDansSystemeFichiers;

public class ObjetRemplirListeExosFromFileSystem implements ObjetMethodeRemplissage {

	public ObjetRemplirListeExosFromFileSystem() {
		// TODO Auto-generated constructor stub
	}
    
	
	
	@Override
	public List<Exercice> remplirListeExos() {
		// TODO Auto-generated method stub
		// SHAME pomp� honteusement de https://docs.oracle.com/javase/tutorial/essential/io/find.html
		// SHAME de m�me http://tutorials.jenkov.com/java-nio/files.html#files-walkfiletree
		// INTERESSANT : la red�finition d une partie du corps pendant l invocation
		// d�j� rencontr�e (et pas comprise) pendant une lecture de cours tdd sur mockito
		
	}



	@Override
	public List<String> trouverListeExos() {
		// TODO Auto-generated method stub
		UtilitaireIOBaladeDansSystemeFichiers balade = new UtilitaireIOBaladeDansSystemeFichiers("Exercice[A-Z]*.java", ".git");
		//UtilitaireIOBaladeDansSystemeFichiers balade = new UtilitaireIOBaladeDansSystemeFichiers("*", ".git");
		List<String> LExos = balade.GetListeNomsFichiersRespectantPattern();
		// TODO bug des globs : "s" == "S"! du coup Exercices est inclus.
		LExos.remove(LExos.indexOf("Exercices"));

		// besoin d une methode pour g�n�rer auto l uml de familles d'utilitaires:
		// sans "plan", je m'y perds.
		// le g�n�rer � la main est une perte de temps.
		return LExos;
	}

}
