package variablestableauxboucles;

public abstract class UtilitairesTypesContraints <T> {
    protected T t;
	abstract boolean contrainte(T t);
	public void set(T t){ 
		if ( contrainte(t) ){this.t = t; }
		else { 
			ArithmeticException e = new ArithmeticException("contrainte non respectée: valeur " + t + "invalide");
		    throw e;
		}
	}
	public T get(){ return t; }

}
