package variablestableauxboucles;

public class UtilitairesRetoucheNomsFichiers {

	public UtilitairesRetoucheNomsFichiers() {
		// TODO Auto-generated constructor stub
	}

	public static String basename(String s){
		int dot = s.lastIndexOf('.');
		String base = (dot == -1) ? s : s.substring(0, dot);
		return base;
	}
}
