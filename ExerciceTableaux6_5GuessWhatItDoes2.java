package variablestableauxboucles;

public class ExerciceTableaux6_5GuessWhatItDoes2 extends Exercice {

	public ExerciceTableaux6_5GuessWhatItDoes2() {
		
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_type_exercice() {
		
		this.setEnnonce_exo("Que produit l�algorithme suivant ? Tableau N(6) en Entier Variables i, k en Entier D�but N(0) 1 Pour k 1 � 6 N(k) N(k-1)+2 k Suivant Pour i 0 � 6 Ecrire N(i) i suivant Fin Peut-on simplifier cet algorithme avec le m�me r�sultat ?");
		this.numero_exercice = "tableaux exo 6.5";
		this.commentaire_algo = "une seule boucle au lieu de deux fait baisser gros th�ta";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
