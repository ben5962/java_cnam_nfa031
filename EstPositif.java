package variablestableauxboucles;

public class EstPositif implements BoolIf<Integer> {

	public EstPositif() {
		
		// TODO Auto-generated constructor stub
		
	}
     
	@Override
	public boolean Truth(Integer t) {
		// TODO Auto-generated method stub
		return t > 0;
	}
}
