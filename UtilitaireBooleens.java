package variablestableauxboucles;


public class UtilitaireBooleens  {

	public UtilitaireBooleens() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean TrueIfSameTruthValue(int i, int j, BoolIf<Integer> f){
		boolean b1 = f.Truth(i);
		boolean b2 = f.Truth(j);
		return !(b1 ^ b2);
	}

}
