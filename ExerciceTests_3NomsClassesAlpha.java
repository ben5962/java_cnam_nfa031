package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;
public class ExerciceTests_3NomsClassesAlpha extends Exercice {
	String saisir_chaine;
	String chaines_ordonnees;
	String chaines_pas_ordonnees;

	public ExerciceTests_3NomsClassesAlpha() {
		// TODO Auto-generated constructor stub
		initialisation_type_exercice();
		initialisation_specifique();
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		afficher_texte(saisir_chaine);
		String s1 = saisie_chaine();
		afficher_texte(saisir_chaine);
		String s2 = saisie_chaine();
		afficher_texte(saisir_chaine);
		String s3 = saisie_chaine();
		boolean Truth = ordonnes(s1,s2) & ordonnes(s2,s3);
		if (Truth){afficher_texte(chaines_ordonnees);}
		else {afficher_texte(chaines_pas_ordonnees);}

	}
	
	public boolean ordonnes(String a, String b){
		return a.compareToIgnoreCase(b) <= 0;
	
	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.setEnnonce_exo("Ecrire un algorithme qui demande trois noms � l�utilisateur et l�informe ensuite s�ils sont rang�s ou non dans l�ordre alphab�tique. Il faut utiliser la m�thode compareToIgnoreCase de la classe String qui retourne : un nombre n�gatif si le String appelant la m�thode est avant le String pass�e en param�tre;0 si les deux String sont �gaux; un nombre positif si le String appelant la m�thode est apr�s le String pass�e en param�tre.");
     this.numero_exercice = "exercice 3";
     this.ennonce_exo = "Ecrire un algorithme qui demande trois noms � l�utilisateur\n"
				+"et l�informe ensuite s�ils sont rang�s ou non dans l�ordre alphab�tique.\n"
				+"Il faut utiliser la m�thode compareToIgnoreCase de la classe String qui retourne :\n"
				+ "un nombre n�gatif si le String appelant la m�thode est avant le String pass�e en param�tre;\n"
				+ "0 si les deux String sont �gaux;\n"
				+"un nombre positif si le String appelant la m�thode est apr�s le String pass�e en param�tre.";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		
		this.saisir_chaine = "saisissez un mot";
		this.chaines_ordonnees = "les chaines st ordonn�es";
		this.chaines_pas_ordonnees = "les chaines ne st pas ordonn�es";
		
		
	}

}
