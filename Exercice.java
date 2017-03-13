package variablestableauxboucles;

public abstract class Exercice {
	// Exercice d�finit le concept d exercice comme un objet:
	//
	// - poss�dant 6 champs: numero_exercice, nom_exercice, commentaire_algo, 
	//                      commentaire_implementation, interet_exo et ennonce_exercice.
	//              ( leur valeur est d�finie dans les classes filles
	//                     mais l accesseur() est d�j� d�fini ici. )
	//
	//
	// - poss�dant 2 m�thodes : - doit() executant l exo
	//     (dont le corps est d�fini dans les filles) 
	//     j aimerais que cela rende la d�finition de la m�thode doit OBLIGATOIRE dans
	//     les filles.
	//                          - initialisation_type_exercice()
	//                             pour repousser vers le bas du code la saisie des variables
	//                            (pour rendre le code plus lisible pour le relecteur:
	//                             virer en bas ce qu il n a pas besoin de lire)
	
	
	
	// contrat champ 1/6 : numero_exercice, 
	// commentaire bricolages:
		// essai d acces � un champ propre � chaque sous classe
		// mais dont la m�thode accesseur est d�finie dans une superclasse
		// afin de ne pas avoir � r��crire l accesseur dans chaque sous-classe
		// (h�ritage)
		// essais : 
		//  - un modificateur private n exporte pas la variable
		//    avec le reste du moule dans les classes filles
		//    (numero exercice is not visible)
		//  - protected semble fonctionner mais �tend la possibilit� de modifier la  
		//  valeur de num�ro exo � tout le package, pas seulement aux classes fille
		// et sans passer par un setter. pas de solution pour � la fois
		//  - faire "descendre" l id�e qu une classe contient un champ priv�
		// - qu'on peut y acc�der par une m�thode d�finie dans une superclasse
		// - que la valeur du  champ priv� auquel on acc�de est celui de la sous classe
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
	
	// contrat champs 3/6 � 6/6  commentaire_algo, commentaire_implementation, interet_exo
	//                           et ennonce_exercice : 
	// meme construction que 1/6 numero exercice. donc copi� coll� avec chgt noms vars.

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
