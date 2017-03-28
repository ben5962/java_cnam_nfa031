package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_tableau;
import static variablestableauxboucles.UtilitaireEntreesSorties.afficher_texte;
public class ExerciceTableaux_4GuessWhatItDoes1 extends Exercice {
	private int[] t_nb = new int[5];
	private int i;

	public ExerciceTableaux_4GuessWhatItDoes1() {
		
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		afficher_texte("avec deux boucles: 1 calcul 1 affichage");
		algo_v1();
		afficher_texte("deuxieme version: un seul parcours de tableau");
		algo_v2();


	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.setEnnonce_exo("Que produit l’algorithme suivant ? Tableau Nb(5) en Entier Variable i en Entier Début Pour i 0 à 5 Nb(i) i * i i suivant Pour i 0 à 5 Ecrire Nb(i) i suivant Fin Peut-on simplifier cet algorithme avec le même résultat ?");
		this.numero_exercice = "bableaux exo4";
		this.setCommentaire_implementation(commentaire_implementation);
		this.commentaire_implementation = "devait me permettre initialement de  de jouer avec les blocs nommés, apparement utilisés normalement comme label pour des breaks à la GOTO. factorisation du code. j ai finalement abandonné l'idée. cet exo calcule la série des puiss de 2 d n nb ";
	}

	@Override
	public void initialisation_specifique() {
		// rien à faire
	}
	
	public void algo_v1(){
		for (int i=0; i<this.t_nb.length; i++){
			this.t_nb[i] = (int)Math.pow(i, 2);
					
		}
		afficher_tableau(this.t_nb); // correspond à un nouveau parcours
	}
	
	public void algo_v2(){
		// un seul parcours de la liste
		StringBuilder s = new StringBuilder();
		s.append("@alamain[");
		for (int i=0; i<this.t_nb.length; i++){
			int a_ajouter = (int)Math.pow(i, 2);
			this.t_nb[i] = a_ajouter;

			s.append(String.valueOf(a_ajouter));
			s.append(" ");
					
		}
		s.append("]");
		afficher_texte(s.toString());
		
	}

}
