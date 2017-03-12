package variablestableauxboucles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConteneurExercices implements Iterable<Exercice> {


private final List<Exercice> exercices = new ArrayList<Exercice>();
public ConteneurExercices(List<Exercice> Lexercices){
	if (Lexercices != null){
		this.exercices.addAll(Lexercices);
	}
	
}

public Iterator<Exercice> iterator(){
	return exercices.iterator();
}
}
