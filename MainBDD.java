package variablestableauxboucles;
import java.util.Arrays;
import java.util.List;

import variablestableauxboucles.MainObjetMethodeRemplissage;
import variablestableauxboucles.MainObjetRemplirListeExosFromFileSystem;
import variablestableauxboucles.MainConteneurExercices;

public class MainBDD {
    // responsabilité : connaitre tous les exercices (sous forme de chaine ca ira)
	//                  renvoie un conteneur exercice = f(parametres) d exos instanciés
	private List<String> LChaineTousExos;
	private MainObjetMethodeRemplissage methoderemplissage;
	
	public List<String> getLChaineTousExos() {
		return LChaineTousExos;
	}

	private String any = "any";
	
	public MainBDD() {
		// responsabilité 1 : connaitre tous les exos
		MainObjetMethodeRemplissage m_auto = new MainObjetRemplirListeExosFromFileSystem();
		setChaineTousExos(m_auto);
	}

	private void setChaineTousExos(MainObjetMethodeRemplissage m_auto){
		// délègue à un objet Methode de Remplissage le fait de trouver les exos
		this.LChaineTousExos = m_auto.trouverListeExos();
		this.methoderemplissage = m_auto;
		
	}
	
	public MainConteneurExercices getConteneurExercices(){
		// responsabilité 2 : renvoie un conteneurExercices
		List<Exercice> lexos = methoderemplissage.InstancierTousExos(getLChaineTousExos());
		return new MainConteneurExercices(lexos);
		
		
	}
	
	public MainConteneurExercices getConteneurExercices(String NomExercice)  {
		
		//on vérifie que l argument est dans Lexos et si oui on renvoie. sinon 
		// on plante
		List <Exercice> lexos = Arrays.asList();
		
		try{
			if (! getLChaineTousExos().contains(NomExercice)){
				ClassNotFoundException c = new ClassNotFoundException("Classe pas trouvée:" + NomExercice);
			throw c;			
			}
			else {
				//filtrer la liste à son plus simple élément
				List<String> listeChaineExos_modifiee = Arrays.asList(NomExercice);
				lexos = methoderemplissage.InstancierTousExos(listeChaineExos_modifiee);
				
			
			}
		}
		catch (ClassNotFoundException E){
			// ne pas l ajouter, silencieusement (ne pas planter quoi)
			// mais ajouter quand meme un message sur la console
			System.out.println(E.getMessage());
			E.printStackTrace();
		
		}
		return new MainConteneurExercices(lexos);
	}
	
	
}
