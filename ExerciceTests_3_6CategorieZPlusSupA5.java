package variablestableauxboucles;

public class ExerciceTests_3_6CategorieZPlusSupA5 extends Exercice {

	public ExerciceTests_3_6CategorieZPlusSupA5() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
       this.numero_exercice = "3.6";
       afficher_texte(demander_age);
       int age = saisie_entier();
       switch(age){
       case 6: case 7: afficher_texte(texte_poussins);
       break;
       case 8: case 9: affichier_texte(texte_pupilles);
       break;
       case 10: case 11: afficher_texte(texte_minimes);
       break;
       default: afficher_texte(texte_cadets);
       break;
    	   
       
       }
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
