package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireChainesCommunes.*;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;


public class ExerciceTests_3_6CategorieZPlusSupA5 extends Exercice {

	public ExerciceTests_3_6CategorieZPlusSupA5() {
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
			afficher_texte(demander_age);
	       int age = saisie_entier();
	       switch(age){
	       case 6: case 7: afficher_texte(texte_poussins);
	       break;
	       case 8: case 9: afficher_texte(texte_pupilles);
	       break;
	       case 10: case 11: afficher_texte(texte_minimes);
	       break;
	       default: afficher_texte(texte_cadets);
	       break;
	       }
	}

	       
	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
       this.numero_exercice = "3.6";
       this.setEnnonce_exo("Ecrire un algorithme qui demande l��ge d�un enfant � l�utilisateur. Ensuite, il l�informe de sa cat�gorie : Poussin de 6 � 7 ans  Pupille de 8 � 9 ans Minime de 10 � 11 ans Cadet apr�s 12 ans Peut-on concevoir plusieurs algorithmes �quivalents menant � ce r�sultat ?");
    	   
       
       }


	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
	}

}
