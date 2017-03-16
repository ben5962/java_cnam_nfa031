package variablestableauxboucles;
import java.nio.file.FileSystems;
import  java.nio.file.Path;
import java.nio.file.PathMatcher;

public class EstUnMatchDePatternChemin implements BoolIf<Path> {

protected String pattern;	
	@Override
	public boolean Truth(Path t) {
		// TODO Auto-generated method stub
		
		 PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
		 Path nomfichier = t.getFileName();
         if (nomfichier != null && matcher.matches(nomfichier)) { return true; }
         else { return false; } 
	}

	public EstUnMatchDePatternChemin(String p) {
		// TODO Auto-generated constructor stub
		this.setPattern(p);
	}
	
	public void setPattern(String p){
		this.pattern = p;
	}

}
