package variablestableauxboucles;
import junit.framework.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import variablestableauxboucles.MainObjetRemplirListeExosFromFileSystem;
import variablestableauxboucles.MainBDD;
import variablestableauxboucles.MainConteneurExercices;


public class Test_Avancement extends TestCase {
    
	// requis par le framework
	public Test_Avancement(String name) {
		super(name);
	}
	
	/*@Test
	public void Test_junit(){
		fail("rien d écrit pour l instant");
	}*/
	
	public void test_BDD_skippe_un_exo_inexistant(){
            MainBDD bidule = new MainBDD();
            MainConteneurExercices cametonnerait = bidule.getConteneurExercices("existe pas");
            Iterator<Exercice> i = cametonnerait.iterator();
            assertFalse(i.hasNext());
	}
	
	
	public void test_tous_les_exos_ont_un_ennonce(){
		MainObjetRemplirListeExosFromFileSystem o = new MainObjetRemplirListeExosFromFileSystem();
		List<String> listeexos = o.trouverListeExos();
		String chaine = "pas la bonne chaine";
		String getter_teste = "getEnnonce_exo";
		String valeur_par_defaut_si_setter_pas_appele_dans_constructeur = "pas la bonne chaine";
		for (String NomFichier: listeexos){
			String valeur_constatee_dans_le_fichier = Test_tout_getter(NomFichier, getter_teste, valeur_par_defaut_si_setter_pas_appele_dans_constructeur );
			String message_si_echec = "dans le fichier " + NomFichier + "lors de l appel du constructeur, oubli d appel du setter correspondant au getter " + getter_teste + " la valeur obtenue était: " + valeur_constatee_dans_le_fichier;
			
			assertEquals(message_si_echec, valeur_constatee_dans_le_fichier.equals(valeur_par_defaut_si_setter_pas_appele_dans_constructeur), false);
			
		}
	}
	
	public static void Test_toutes_methodes(String nomclasse){
		String myPackage = "variablestableauxboucles";
		
		try {
			Class<?> classe_exo = Class.forName(myPackage + '.' + nomclasse);
			Constructor<?> ctor = classe_exo.getConstructors()[0];
			Object exo = ctor.newInstance();
			Method[] m = classe_exo.getMethods();
			for (Method lamethode: m){
				System.out.println(lamethode.getName());
			}
			
			
			
			//constructeurClasseExercice = classeExercice.getConstructor();
			// TODO Type mismatch: cannot convert from capture
			//Exercice e = constructeurClasseExercice.newInstance();
			//e.getCommentaireEnnonceExo();
		} catch (ClassNotFoundException 
				//| NoSuchMethodException 
				| SecurityException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
	
	public static void Test_methodes_declarees(String nomclasse){
		String myPackage = "variablestableauxboucles";
		
		try {
			Class<?> classe_exo = Class.forName(myPackage + '.' + nomclasse);
			Constructor<?> ctor = classe_exo.getConstructors()[0];
			Object exo = ctor.newInstance();
			Method[] m = classe_exo.getDeclaredMethods();
			for (Method lamethode: m){
				System.out.println(lamethode.getName());
			}
			
			
			
			//constructeurClasseExercice = classeExercice.getConstructor();
			// TODO Type mismatch: cannot convert from capture
			//Exercice e = constructeurClasseExercice.newInstance();
			//e.getCommentaireEnnonceExo();
		} catch (ClassNotFoundException 
				//| NoSuchMethodException 
				| SecurityException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
	public static void Test_getter_declare(String nomclasse, String nomduGetter, String valeurpardefaut){
		//Class<?> classeExercice;
		//Constructor<?> constructeurClasseExercice;
		String myPackage = "variablestableauxboucles";
					
		try {
			Class<?> classe_exo = Class.forName(myPackage + '.' + nomclasse);
			Constructor<?> ctor = classe_exo.getConstructors()[0];
			Object exo = ctor.newInstance();
			String ch = (String) classe_exo.getDeclaredMethod(nomduGetter).invoke(exo);
			System.out.println(ch);
			
			
			
			//constructeurClasseExercice = classeExercice.getConstructor();
			// TODO Type mismatch: cannot convert from capture
			//Exercice e = constructeurClasseExercice.newInstance();
			//e.getCommentaireEnnonceExo();
		} catch (ClassNotFoundException 
				| NoSuchMethodException 
				| SecurityException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	
	
	public static String Test_tout_getter(String nomclasse, String nomduGetter, String valeurpardefaut){
		//Class<?> classeExercice;
		//Constructor<?> constructeurClasseExercice;
		String myPackage = "variablestableauxboucles";
		String ch = valeurpardefaut;			
		try {
			Class<?> classe_exo = Class.forName(myPackage + '.' + nomclasse);
			Constructor<?> ctor = classe_exo.getConstructors()[0];
			Object exo = ctor.newInstance();
			ch = (String) classe_exo.getMethod(nomduGetter).invoke(exo);
			
			
			
			
			//constructeurClasseExercice = classeExercice.getConstructor();
			// TODO Type mismatch: cannot convert from capture
			//Exercice e = constructeurClasseExercice.newInstance();
			//e.getCommentaireEnnonceExo();
		} catch (ClassNotFoundException 
				| NoSuchMethodException 
				| SecurityException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ch;
	}

}
