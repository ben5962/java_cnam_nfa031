package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_tableau;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
public class ExerciceTableaux6_5GuessWhatItDoes2 extends Exercice {
 

	public ExerciceTableaux6_5GuessWhatItDoes2() {
		
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		afficher_texte("premiere maniere");
		algo1();
		afficher_texte("deuxieme maniere une seule boucle");
		algo2();

	}

	@Override
	public void initialisation_type_exercice() {
		
		this.setEnnonce_exo("Que produit l’algorithme suivant ? Tableau N(6) en Entier Variables i, k en Entier Début N(0) 1 Pour k 1 à 6 N(k) N(k-1)+2 k Suivant Pour i 0 à 6 Ecrire N(i) i suivant Fin Peut-on simplifier cet algorithme avec le même résultat ?");
		this.numero_exercice = "tableaux exo 6.5";
		this.commentaire_algo = "une seule boucle au lieu de deux fait baisser gros théta";
	}

	@Override
	public void initialisation_specifique() {
		
		
	}
	
	public void algo1(){
		int[] t = new int[6];
		int k, n;
		k = 1;
		t[0] = 1;
		for (; k< 6; k++){
			t[k] = t[k - 1] + 2;
		}
		
	   afficher_tableau(t);
	}
	
	public void algo2(){
		// pour simplifier on peut:
		// 1) résoudre la réccurence
		// 2) n'avoir qu'un parcours de tableau
		
		int[] t = new int[6];
		StringBuilder sb= new StringBuilder();
		sb.append("@alamain[");
		for (int k=0; k< 6; k++){
			t[k] = 2*k+1;
			sb.append(String.valueOf(t[k]) + " ");
			
		}
		sb.append("]");
		afficher_texte(sb.toString());
	}

}
