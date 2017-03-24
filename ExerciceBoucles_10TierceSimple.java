package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;

public class ExerciceBoucles_10TierceSimple extends Exercice {

	public ExerciceBoucles_10TierceSimple() {
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	@Override
	public void doit() {
		// Cnp doit pouvoir se simplifier en n n-1 .... n -p + 1 = numérateur
		// Anp doit pouvoir se simplicfier en  numerateur / p!
		// factorielle a déjà été calculée lors d un exercice précédent.
		// je vais calculer le num commun
		// puis je vais calculer la factorielle du denum de Anp.
		// enfin j affiche le résultat.
		UtilitaireEntreesSorties.afficher_texte("nombre de partants?");
		int n = UtilitaireEntreesSorties.saisie_entier();
		UtilitaireEntreesSorties.afficher_texte("nombre de chevaux joués?");
		int p = UtilitaireEntreesSorties.saisie_entier();
		
		int element_neutre_mult = 1;
		
		int mini_denominateur = 1;
		int maxi_denominateur = p;
		int cpt_denominateur = mini_denominateur;
		int accu_denominateur = element_neutre_mult;
		
		
		int mini_numerateur =  n - p + 1;
		int maxi_numerateur = n;
		int cpt_numerateur = mini_numerateur;
		int accu_numerateur = element_neutre_mult;
		
		for (; cpt_numerateur <= maxi_numerateur; cpt_numerateur++){
			accu_numerateur = accu_numerateur * cpt_numerateur;
		}
		
		for (; cpt_denominateur <= maxi_denominateur; cpt_denominateur++){
			accu_denominateur = accu_denominateur * cpt_denominateur;
		}
		
		UtilitaireEntreesSorties.afficher_texte("dans le désordre : une chance sur " + String.valueOf(accu_numerateur/accu_denominateur)  + " de gagner.");
		UtilitaireEntreesSorties.afficher_texte("dans l'ordre : une chance sur " + String.valueOf(accu_numerateur)  + " de gagner.");
		

	}
	
	

	@Override
	public void initialisation_type_exercice() {
		setEnnonce_exo("Écrire un algorithme qui permette de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts volontaires. On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux messages affichés devront être : Dans l’ordre : une chance sur X de gagner Dans le désordre : une chance sur Y de gagner X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de chevaux joués (on rappelle que le signe ! signifie \"factorielle\", comme dans l'exercice 5.6 ci-dessus) : X = n ! / (n - p) ! Y = n ! / (p ! * (n – p) !) NB : cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version permettant de le résoudre.");
		this.numero_exercice = "boucles 10";

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

	

}
