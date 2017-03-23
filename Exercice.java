package variablestableauxboucles;
import static variablestableauxboucles.UtilitaireEntreesSorties.*;




public abstract class Exercice {
	// Exercice définit le concept d exercice comme un objet:
	//
	// - possédant 6 champs: numero_exercice, nom_exercice, commentaire_algo, 
	//                      commentaire_implementation, interet_exo et ennonce_exercice.
	//              ( leur valeur est définie dans les classes filles
	//                     mais l accesseur() est déjà défini ici. )
	//
	//
	// - possédant 2 méthodes abs: - doit() executant l exo
	//     (dont le corps est défini dans les filles) 
	//     j aimerais que cela rende la définition de la méthode doit OBLIGATOIRE dans
	//     les filles.
	//                          - initialisation_type_exercice()
	//                             pour repousser vers le bas du code la saisie des variables
	//                            (pour rendre le code plus lisible pour le relecteur:
	//                             virer en bas ce qu il n a pas besoin de lire)
	//   possédant les utilitaires que j ai voulu factoriser
	
	
	// contrat champ 1/6 : numero_exercice, 
	// commentaire bricolages:
		// essai d acces à un champ propre à chaque sous classe
		// mais dont la méthode accesseur est définie dans une superclasse
		// afin de ne pas avoir à réécrire l accesseur dans chaque sous-classe
		// (héritage)
		// essais : 
		//  - un modificateur private n exporte pas la variable
		//    avec le reste du moule dans les classes filles
		//    (numero exercice is not visible)
		//  - protected semble fonctionner mais étend la possibilité de modifier la  
		//  valeur de numéro exo à tout le package, pas seulement aux classes fille
		// et sans passer par un setter. pas de solution pour à la fois
		//  - faire "descendre" l idée qu une classe contient un champ privé
		// - qu'on peut y accéder par une méthode définie dans une superclasse
		// - que la valeur du  champ privé auquel on accède est celui de la sous classe
	public String nope = "pas la bonne chaine";
	protected String numero_exercice = nope; 
    protected String commentaire_algo = nope; 
   	protected String commentaire_implementation = nope; 
   	protected String interet_exo = nope; 
   	protected String ennonce_exo = nope; 
	
    
    
   
   	public String getNumero_exercice() {
		return numero_exercice;
	}


	public void setNumero_exercice(String numero_exercice) {
		this.numero_exercice = numero_exercice;
	}


	public String getCommentaire_algo() {
		return commentaire_algo;
	}


	public void setCommentaire_algo(String commentaire_algo) {
		this.commentaire_algo = commentaire_algo;
	}


	public String getCommentaire_implementation() {
		return commentaire_implementation;
	}


	public void setCommentaire_implementation(String commentaire_implementation) {
		this.commentaire_implementation = commentaire_implementation;
	}


	public String getInteret_exo() {
		return interet_exo;
	}


	public void setInteret_exo(String interet_exo) {
		this.interet_exo = interet_exo;
	}


	public String getEnnonce_exo() {
		return ennonce_exo;
	}


	public void setEnnonce_exo(String ennonce_exo) {
		this.ennonce_exo = ennonce_exo;
	}


	
   	
   	
   	// contrat champ 2/6 :nom_exercice
   	
	public String getNomExo(){
		return this.getClass().getName();
		
		}
	
	// contrat champs 3/6 à 6/6  commentaire_algo, commentaire_implementation, interet_exo
	//                           et ennonce_exercice : 
	// meme construction que 1/6 numero exercice. donc copié collé avec chgt noms vars.

	

   	
public abstract void doit();
public abstract void initialisation_type_exercice();
public abstract void initialisation_specifique();










/*public boolean EstPositif(int i){
	return i > 0;
}*/


}
