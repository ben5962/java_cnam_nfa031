package variablestableauxboucles;

public class ExerciceBoucles_10TierceSimple extends Exercice {

	public ExerciceBoucles_10TierceSimple() {
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

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
