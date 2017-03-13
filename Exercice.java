package variablestableauxboucles;

public abstract class Exercice {
	// Exercice définit le concept d exercice comme un objet:
	//
	// - possédant 6 champs: numero_exercice, nom_exercice, commentaire_algo, 
	//                      commentaire_implementation, interet_exo et ennonce_exercice.
	//              ( leur valeur est définie dans les classes filles
	//                     mais l accesseur() est déjà défini ici. )
	//
	//
	// - possédant 2 méthodes : - doit() executant l exo
	//     (dont le corps est défini dans les filles) 
	//     j aimerais que cela rende la définition de la méthode doit OBLIGATOIRE dans
	//     les filles.
	//                          - initialisation_type_exercice()
	//                             pour repousser vers le bas du code la saisie des variables
	//                            (pour rendre le code plus lisible pour le relecteur:
	//                             virer en bas ce qu il n a pas besoin de lire)
	
	
	
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
	protected String numero_exercice = "numero_exercice: pas la bonne chaine"; 
   	public void getNumeroExo(){
   		System.out.println("numero exercice:");
		System.out.println(this.numero_exercice);
	}
   	
   	
   	// contrat champ 2/6 :nom_exercice
   	
	public void getNomExo(){
		System.out.println("nom fichier:");
		System.out.println(this.getClass().getName());
		
		}
	
	// contrat champs 3/6 à 6/6  commentaire_algo, commentaire_implementation, interet_exo
	//                           et ennonce_exercice : 
	// meme construction que 1/6 numero exercice. donc copié collé avec chgt noms vars.

	protected String commentaire_algo = "commentaire algo: pas la bonne chaine"; 
   	public void getCommentaireAlgo(){
   		System.out.println("commentaire_algo:");
		System.out.println(this.commentaire_algo);
	}
	
   	protected String commentaire_implementation = "commentaire implementation: pas la bonne chaine"; 
   	public void getCommentaireImplementation(){
   		System.out.println("commentaire_implementation:");
		System.out.println(this.commentaire_implementation);
	}
   	
   	protected String interet_exo = "interet_exo: pas la bonne chaine"; 
   	public void getCommentaireInteretExo(){
   		System.out.println("interet_exo");
		System.out.println(this.interet_exo);
	}
   	
   	protected String ennonce_exo = "ennonce_exo: pas la bonne chaine"; 
   	public void getCommentaireEnnonceExo(){
   		System.out.println("ennonce:");
		System.out.println(this.ennonce_exo);
	}
   	
public abstract void doit();
public abstract void initialisation_type_exercice();
}
