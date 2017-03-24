package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;

public class ExerciceBoucles_5SommeEntiers extends Exercice {

	public ExerciceBoucles_5SommeEntiers() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		UtilitaireEntreesSorties.afficher_texte("saisir entier");
		int saisie = UtilitaireEntreesSorties.saisie_entier();
		int mini = 1;
		int maxi = saisie;
		int cpt = mini;
		int accu = 0;
		
		// n * (n+1) / 2 si pas exercice  pédagogique sur boucles
		for (; cpt <= maxi; cpt++){
			accu = accu + cpt;
			
		}
		
		// autre possibilité :
		// Integer resultat = SommeEntiersRec(saisie, new Integer(0));
		
		
		UtilitaireEntreesSorties.afficher_texte("la somme des " + saisie + "premiers entiers vaut :" + Integer.toString(accu));
		
	

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce nombre. Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.");
      
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}
	
	public Integer SommeEntiersRec(Integer etape, Integer accu){
		if (etape.equals(new Integer(0))){
			return accu;
		}
		else {
			return SommeEntiersRec(new Integer(etape - 1), new Integer(accu + etape));
		}
		
	}

}
