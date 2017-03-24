package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
public class ExerciceBoucles_8PlusGdNbPositBcleInfinie extends Exercice {

	public ExerciceBoucles_8PlusGdNbPositBcleInfinie() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		int cpt = 1;
	    int accu_indice = 1;
	    int accu_max = 0;
	    while(true){
	    	UtilitaireEntreesSorties.afficher_texte("entrer nv nb, 0 pour cesser");
	    	int saisie = UtilitaireEntreesSorties.saisie_entier();
	    	if (new Integer(saisie).equals(0)){
	    		break;
	    	}
	    	if (saisie > accu_max){
	    		accu_max = saisie;
	    		accu_indice = cpt;
	    	}
	    	cpt = cpt + 1;
	    }
	    UtilitaireEntreesSorties.afficher_texte("le max vaut : " + String.valueOf(accu_max) + " " + "� l indice :" + String.valueOf(accu_indice));

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("R��crire l�algorithme pr�c�dent, mais cette fois-ci on ne conna�t pas d�avance combien l�utilisateur souhaite saisir de nombres. La saisie des nombres s�arr�te lorsque l�utilisateur entre un z�ro.");
		this.numero_exercice = "boucles 8";
		this.setCommentaire_algo("le do while (loop until) ne marche pas ici car il faut v�rifier la condition de sortie dans la boucle");
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
