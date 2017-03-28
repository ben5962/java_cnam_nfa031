package variablestableauxboucles;

import java.util.Arrays;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;

public class ExerciceTableaux_1TableauRemplir7 extends Exercice {
	// les tableaux java ont une longueur fixe et ne sont pas mutables.
	// consequence: il faut déclarer la longueur du  tableau.
	// l'initialisation du tableau se fait:
	// - soit en deux (ou trois) temps : 
	// 1 un tableau declarer sans fixer longueur pour l'instant ni de valeur
	private Integer tableau7_nilg_niini[];
	// 2 puis declarer que le conteneur recoit un objet de longueur machin
	// conf setTableau7_nilg_niini
	// 1 et 2 peuvent etre combinés:
	private int tableau7_lgfixee[] = new int[7];
	// 3 puis le remplir. 
	// conf setTableau7_nilg_niini et setTableau7_lgfixee
	// avec sucre syntaxique de langage pour le deuxieme: fill
	// - soit en un seul temps: utiliser un constructeur pour remplir 
	private int autre_tableau7[] = { 0,0,0,0,0,0,0 };
	private int dernier_tableau7[] = new int[]{0,0,0,0,0,0,0};
	// declarer et fixer longueur
	
		
	// déclarer, fixer longueur et l initialiser (petit tableau):
	
	
	
	
	public int[] getDernier_tableau7() {
		return dernier_tableau7;
	}

	public void setDernier_tableau7() {
		//pass déjà fait.
	}

	public Integer[] getTableau7_nilg_niini() {
		return tableau7_nilg_niini;
	}

	public void setTableau7_nilg_niini() {
		int valeur_ini = 0;
		this.tableau7_nilg_niini = new Integer[7];
		// ini tabl longueur fixe. utiliser sa lg pour borner l ini
				for (int indice = 0; indice < this.tableau7_nilg_niini.length; indice ++){
					this.tableau7_nilg_niini[indice] = new Integer(valeur_ini);
				}
		
	}
	
	public void setTableau7_nilg_niini_interdit(int[] tableau7_nilg_niini) {
		
		// ini tabl long libre. il faut borner l ini
		int indice_mini = 0;
		int taille_souhaitee = 7 ;
		int valeur_ini = 0;
		int indice_maxi = indice_mini + taille_souhaitee - 1;
		
		
				for (int i=indice_mini; i<= indice_maxi; i++){
					try {	this.tableau7_nilg_niini[i] = valeur_ini;
					}
					catch (NullPointerException n ){
						n.printStackTrace();
						System.out.println("indice vaut: " +  String.valueOf(i));
						System.out.println("valeur_ini vaut: " + String.valueOf(valeur_ini));
						System.out.println("tableau[" + String.valueOf(i) + "]:" + this.tableau7_nilg_niini[i]);
						System.out.println(n.getMessage());
					}
				}
//		    eh non marche pas ! le tableau doit être borné.
//				cf
//				Pour déclarer un tableau vide en java, 
//				<type du tableau> <nom du tableau> [] = new <type du tableau>[nb element];
//
//				Exemple :
//				int tableEntier[] = new int[6];
//				String[] tableData=new String[10]; 
		
	
		
	}
	
	

	public int[] getTableau7_lgfixee() {
		return tableau7_lgfixee;
	}

	public void setTableau7_lgfixee() {
		Arrays.fill(this.tableau7_lgfixee, 0);
	}

	public int[] getAutre_tableau7() {
		return autre_tableau7;
	}

	public void setAutre_tableau7() {
		// déjà initialisé
	}

	
	
	

	public ExerciceTableaux_1TableauRemplir7() {
		
		initialisation_type_exercice();
		initialisation_specifique();
		
				
	}

	/* (non-Javadoc)
	 * @see variablestableauxboucles.Exercice#doit()
	 */
	@Override
	public void doit() {

		//UtilitaireEntreesSorties.afficher_tableau(this.getTableau7_nilg_niini());
		//UtilitaireEntreesSorties.afficher_tableau(this.getAutre_tableau7());
		
		
		
		UtilitaireEntreesSorties.afficher_tableau(this.getTableau7_nilg_niini());
		UtilitaireEntreesSorties.afficher_tableau(this.getTableau7_lgfixee());
		UtilitaireEntreesSorties.afficher_tableau(this.getAutre_tableau7());
		UtilitaireEntreesSorties.afficher_tableau(this.getDernier_tableau7());
		

	}

	@Override
	public void initialisation_type_exercice() {
		this.setEnnonce_exo("Ecrire un algorithme qui déclare et remplisse un tableau de 7 valeurs numériques en les mettant toutes à zéro.");
		this.setInteret_exo("les 4 manières de déclarer et d'initialiser un objet");
		
	}

	@Override
	public void initialisation_specifique() {
		this.setTableau7_nilg_niini();
		this.setTableau7_lgfixee();
		this.setAutre_tableau7();
		this.setDernier_tableau7();
	
		
	}

}
