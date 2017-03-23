package variablestableauxboucles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class MainObjetMethodeRemplissage {
	// la responsabilité de trouver la liste des exos
	abstract List<String> trouverListeExos();
	
	// la responsabilité de construire une liste d instance d exos
	// TODO : rendre ca un peu plus élégant. 
	public List<Exercice> InstancierTousExos(List<String> lchaineexos){
		List<Exercice> linstancesexos = new ArrayList<Exercice>();
		String myPackage = "variablestableauxboucles";
		for (String nomclasse: lchaineexos){
			try{
			Class<?> type_classe_exo = Class.forName(myPackage + '.' + nomclasse);
			Constructor<?> instance_ctor = type_classe_exo.getConstructors()[0];
			Exercice instance_exercice = (Exercice) instance_ctor.newInstance();
			linstancesexos.add(instance_exercice);
			}
			catch (ClassNotFoundException 
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
		return linstancesexos;
	}
}
 
