package variablestableauxboucles;

public class EstNegatif implements BoolIf<Integer> {

	public EstNegatif() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean Truth(Integer t) {
		// TODO Auto-generated method stub
		return t < 0;
	}

}
