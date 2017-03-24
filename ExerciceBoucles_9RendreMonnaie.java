package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;
public class ExerciceBoucles_9RendreMonnaie extends Exercice {

	public ExerciceBoucles_9RendreMonnaie() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		int a_payer = cumulTicketCaisse();
		UtilitaireEntreesSorties.afficher_texte("saisir le montant versé par le lcient");
		int paye = UtilitaireEntreesSorties.saisie_entier();
		rendreMonnaie(a_payer, paye);
	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Lire la suite des prix (en euros entiers et terminée par zéro) des achats d’un client. Calculer la somme qu’il doit, lire la somme qu’il paye, et simuler la remise de la monnaie en affichant les textes 10 Euros 5 Euros et 1 Euro autant de fois qu’il y a de coupures de chaque sorte à rendre.");
       this.numero_exercice = "boucles 9";
       this.setCommentaire_algo("evidement les algos précédents y ressemblent bcp. j essayeria de faire version suivante avec regroupement des foncitons communes et encapsulation des variations");
	}

	@Override
	public void initialisation_specifique() {
	
		
	}
	
	public int cumulTicketCaisse(){
		int cpt = 1;
	    int accu_indice = 1;
	    int accu = 0;
	    while(true){
	    	UtilitaireEntreesSorties.afficher_texte("entrer nv prix, 0 pour cesser");
	    	int saisie = UtilitaireEntreesSorties.saisie_entier();
	    	if (new Integer(saisie).equals(0)){
	    		break;
	    	}
	    	accu = accu + saisie;
	    	cpt = cpt + 1;
	    }
	    UtilitaireEntreesSorties.afficher_texte("à payer : " + String.valueOf(accu));
	    return accu;
	}
	
	public void rendreMonnaie(int a_payer ,int paye){
		if (a_payer > paye ){
			UtilitaireEntreesSorties.afficher_texte("somme payée insuffisante pour régler doit");
		}
		else {
			int accumulateur = paye - a_payer;
			while (accumulateur > 0){
				if (accumulateur >= 10){
					UtilitaireEntreesSorties.afficher_texte("10");
					accumulateur = accumulateur - 10;
				}
				else { 
						if (accumulateur >= 5 ){
							UtilitaireEntreesSorties.afficher_texte("5");
							accumulateur = accumulateur - 5;
						}
					else { 
							if (accumulateur >= 1) {
								UtilitaireEntreesSorties.afficher_texte("1");
								accumulateur = accumulateur - 1;
							}
					}
				}
			}
		}
	}

}
