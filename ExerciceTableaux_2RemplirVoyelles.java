package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;
public class ExerciceTableaux_2RemplirVoyelles extends Exercice {
private Character[] tableau_voyelles;
	

	@Override
	public void doit() {
		afficher_tableau(this.getTableau_voyelles());
		
	}

	@Override
	public void initialisation_type_exercice() {
		
		setEnnonce_exo("Ecrire un algorithme qui déclare et remplisse un tableau contenant les six voyelles de l’alphabet latin.");
		
	}

	@Override
	public void initialisation_specifique() {
		setTableau_voyelles();
		
	}

	public ExerciceTableaux_2RemplirVoyelles() {
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	public Character[] getTableau_voyelles() {
		return tableau_voyelles;
	}

	public void setTableau_voyelles() {
		this.tableau_voyelles = new Character[] {'a', 'e','i','o','u','y'};
	}

}
