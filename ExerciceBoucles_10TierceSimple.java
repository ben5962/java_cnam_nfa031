package variablestableauxboucles;
import variablestableauxboucles.UtilitaireEntreesSorties;

public class ExerciceBoucles_10TierceSimple extends Exercice {

	public ExerciceBoucles_10TierceSimple() {
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	@Override
	public void doit() {
		// Cnp doit pouvoir se simplifier en n n-1 .... n -p + 1 = num�rateur
		// Anp doit pouvoir se simplicfier en  numerateur / p!
		// factorielle a d�j� �t� calcul�e lors d un exercice pr�c�dent.
		// je vais calculer le num commun
		// puis je vais calculer la factorielle du denum de Anp.
		// enfin j affiche le r�sultat.
		UtilitaireEntreesSorties.afficher_texte("nombre de partants?");
		int n = UtilitaireEntreesSorties.saisie_entier();
		UtilitaireEntreesSorties.afficher_texte("nombre de chevaux jou�s?");
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
		
		UtilitaireEntreesSorties.afficher_texte("dans le d�sordre : une chance sur " + String.valueOf(accu_numerateur/accu_denominateur)  + " de gagner.");
		UtilitaireEntreesSorties.afficher_texte("dans l'ordre : une chance sur " + String.valueOf(accu_numerateur)  + " de gagner.");
		

	}
	
	

	@Override
	public void initialisation_type_exercice() {
		setEnnonce_exo("�crire un algorithme qui permette de conna�tre ses chances de gagner au tierc�, quart�, quint� et autres imp�ts volontaires. On demande � l�utilisateur le nombre de chevaux partants, et le nombre de chevaux jou�s. Les deux messages affich�s devront �tre : Dans l�ordre : une chance sur X de gagner Dans le d�sordre : une chance sur Y de gagner X et Y nous sont donn�s par la formule suivante, si n est le nombre de chevaux partants et p le nombre de chevaux jou�s (on rappelle que le signe ! signifie \"factorielle\", comme dans l'exercice 5.6 ci-dessus) : X = n ! / (n - p) ! Y = n ! / (p ! * (n � p) !) NB : cet algorithme peut �tre �crit d�une mani�re simple, mais relativement peu performante. Ses performances peuvent �tre singuli�rement augment�es par une petite astuce. Vous commencerez par �crire la mani�re la plus simple, puis vous identifierez le probl�me, et �crirez une deuxi�me version permettant de le r�soudre.");
		this.numero_exercice = "boucles 10";

	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

	

}
