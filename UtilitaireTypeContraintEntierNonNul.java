package variablestableauxboucles;

public class UtilitaireTypeContraintEntierNonNul extends UtilitairesTypesContraints<Integer> {

	@Override
	boolean contrainte(Integer t) {
		// TODO Auto-generated method stub
		boolean notegalzero = ! t.equals(new Integer(0));
	    return notegalzero;
	}
  
}
