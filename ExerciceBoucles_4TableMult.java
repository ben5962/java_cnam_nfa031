package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;

public class ExerciceBoucles_4TableMult extends Exercice {

	public ExerciceBoucles_4TableMult() {
	  initialisation_type_exercice();
	  initialisation_specifique();
	}

	@Override
	public void doit() {
		int mini = 1;
		int maxi = 10;
		int cpt = mini;
		UtilitaireEntreesSorties.afficher_texte("entrez un nombre");
		int saisie = UtilitaireEntreesSorties.saisie_entier();
		while (cpt <= maxi){
			UtilitaireEntreesSorties.afficher_texte(cpt + " x" + saisie + " = " + String.valueOf(cpt * saisie));
			cpt = cpt + 1;
		}

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de ce nombre, présentée comme suit (cas où l'utilisateur entre le nombre 7) : Table de 7 : 7 x1= 7 7 x 2 = 14 7 x 3 = 21 …7 x 10 = 70");
      this.numero_exercice = "boucles 4";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
