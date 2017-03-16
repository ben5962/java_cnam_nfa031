package variablestableauxboucles;

import java.util.Scanner;

public final class UtilitaireEntreesSorties {
private static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
//scanner.useDelimiter("\\n");

private static String pas_trouve_chaine_a_lire_sur_entree_courante = "pas de ch à lire in";

	public UtilitaireEntreesSorties() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void afficher_texte(String s){
		System.out.println(s);
	}
	
	public static int saisie_entier(){
		//Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(scanner.next());
		//s.close();
		return i;
		
	}
	
	
	
	public static String saisie_chaine(){
		// tester si l instance existe
		// TODO http://stackoverflow.com/questions/17459050/java-util-nosuchelementexception-no-line-found-at-java-util-scanner-nextlinesc?rq=1
		// (non fermeture de flux)
		// TODO https://www.securecoding.cert.org/confluence/display/java/FIO06-J.+Do+not+create+multiple+buffered+wrappers+on+a+single+byte+or+character+stream 
		// interdiction d en ouvrir 2
		String a = "vide";
		//Scanner scanner = new Scanner(System.in);
		
		try {
			if (scanner.hasNextLine()){
				afficher_texte("nv ligne trouvée. a vaut avant affectation: " + a);
				a = scanner.next();
				afficher_texte("nv ligne trouvée. a vaut apres affectation: " + a);}
		}
		catch (java.util.NoSuchElementException e) {
			afficher_texte(pas_trouve_chaine_a_lire_sur_entree_courante + ' ' + e);
		}
		finally{
			/*if(scanner!=null)
			{ scanner.close();} // TODO if you close it you have to renew it bug BUG JAVA you are not allowed to. so let it leak.
			*/
			
			}
		System.out.println("a vaut: " + a);
		return a;
	}
}
