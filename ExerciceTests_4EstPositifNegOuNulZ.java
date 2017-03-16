package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;


public class ExerciceTests_4EstPositifNegOuNulZ extends Exercice {
	String resultat_positif;
	String resultat_negatif;
	String demande_saisie_nombre;
	

	public ExerciceTests_4EstPositifNegOuNulZ() {
		// TODO Auto-generated constructor stub
		initialisation_type_exercice();
		initialisation_specifique();
		
	}

	@Override
	public void doit() {
		// TODO Auto-generated method stub
		afficher_texte(demande_saisie_nombre);
		int nb = saisie_entier();
		if  ( nb >  0 ){ afficher_texte(resultat_positif);	}
		else {
			if (nv < 0) {afficher_texte(resultat_negatif);}
			else {afficher(nombre_nul);}
		}

	}
    
	
	
	
	@Override
	public void initialisation_type_exercice() {
		// TODO Auto-generated method stub
		this.numero_exercice = "exercice 1";
		this.ennonce_exo = "Ecrire un algorithme qui demande un nombre\n"
				+ "à l’utilisateur, et l’informe ensuite\n" 
				+ "si ce nombre est positif ou négatif \n"
				+ "(on laisse de côté le cas où le nombre vaut zéro).";
		this.interet_exo = "premier essai avec les génériques\n"
				+ "première erreur : java ne considère pas les fonctions comme des \n"
				+ "citoyens de premiere classe. il faut des objets et des if pour les \n"
				+ "wrapper. donc Syntax error, insert Dimensions to complete ReferenceType\n:"
				+ "seul le type integer plutot que int est accepté pour parametriser le type\n"
				+ "générique de lif";
		
	}

	@Override
	public void initialisation_specifique() {
		// TODO Auto-generated method stub
		this.nombre_positif = "le resultat est positif";
		this.nombre_negatif = "le resultat est négatif";
	    this.demande_saisie_nombre = "veuillez saisir un nombre positif ou négatif.";
	    
	}

}
