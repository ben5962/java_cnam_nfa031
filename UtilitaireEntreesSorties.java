package variablestableauxboucles;

import java.util.Arrays;
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
		int i = Integer.parseInt(scanner.nextLine());
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
				a = scanner.nextLine();
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
	
	public static < T > void  afficher_tableau(T[] tab){
		//System.out.println(Arrays.toString(t));
		StringBuilder builder = new StringBuilder();
		builder.append("@construit_a_la_main[");
		for (int i = 0; i < tab.length; i++){
			builder.append(String.valueOf(tab[i]));
			builder.append(", ");
			
		}
		builder.append(tab[tab.length - 1]);
		builder.append("]");
		System.out.println(builder);
	}
	
	// pff devait etre fait pour tous les typs primitifs
	// int char byte float long short double boolean
	// je le fais pour int et char.
	public static void  afficher_tableau(int[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(char[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(byte[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(float[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(short[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(boolean[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	public static void  afficher_tableau(double[] tab){
		String s = "@natif" + Arrays.toString(tab);
		System.out.println(s);
	}
	
	
	
	
}
