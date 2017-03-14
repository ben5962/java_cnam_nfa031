package variablestableauxboucles;

public class ExerciceNomsClassesAlpha extends Exercice {
	String saisir_chaine;

	public ExerciceNomsClassesAlpha() {
		// TODO Auto-generated constructor stub
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
		return a.compareToIgnoreCase(b) >= 0;
	
	}

	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
     this.numero_exercice = "exercice 3";
     this.ennonce_exo = "Ecrire un algorithme qui demande trois noms à l’utilisateur\n"
				+"et l’informe ensuite s’ils sont rangés ou non dans l’ordre alphabétique.\n"
				+"Il faut utiliser la méthode compareToIgnoreCase de la classe String qui retourne :\n"
				+ "un nombre négatif si le String appelant la méthode est avant le String passée en paramètre;\n"
				+ "0 si les deux String sont égaux;\n"
				+"un nombre positif si le String appelant la méthode est après le String passée en paramètre.";
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		this.saisir_chaine = "saisissez un mot\n";
		
		
	}

}
