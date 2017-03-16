package variablestableauxboucles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainConteneurExercices implements Iterable<Exercice> {


private final List<Exercice> exercices = new ArrayList<Exercice>();
public MainConteneurExercices(List<Exercice> Lexercices){
	if (Lexercices != null){
		this.exercices.addAll(Lexercices);
	}
	
}

public Iterator<Exercice> iterator(){
	return exercices.iterator();
}
}
