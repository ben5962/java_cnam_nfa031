package variablestableauxboucles;

public class ExerciceTableaux6_11SommeStroumpfTableau extends Exercice {

	public ExerciceTableaux6_11SommeStroumpfTableau() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_type_exercice() {
	 setEnnonce_exo("Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule le schtroumpf des deux tableaux. Pour calculer le schtroumpf, il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2, et additionner le tout. Par exemple si l'on a : Tableau 1 : 4 8 7 12 Tableau 2 : 3 6 Le Schtroumpf sera : 3 * 4 + 3 * 8 + 3 * 7 + 3 * 12 + 6 * 4 + 6 * 8 + 6 * 7 + 6 * 12 = 279");
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub

	}

}
