package variablestableauxboucles;

import static variablestableauxboucles.UtilitairesRetoucheNomsFichiers.basename;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;

import  java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import variablestableauxboucles.EstUnMatchDePatternChemin;
import static java.nio.file.FileVisitResult.*;


/// pfff walking mecanism:
/// https://docs.oracle.com/javase/tutorial/essential/io/walk.html

public class UtilitaireIOBaladeDansSystemeFichiers extends SimpleFileVisitor<Path> {
private String patternFichierAInclure;
private String chaineRepertoireAExclure;
private List<String> LNomsFichiers; 
private Path StartingDir;

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		if (dir.getFileName().toString().equals(this.getRepertoireAExclure())) {
	         return SKIP_SUBTREE;
	    }
	    return CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path cheminfichier, BasicFileAttributes attrs) throws IOException {
		EstUnMatchDePatternChemin fi = new EstUnMatchDePatternChemin(patternFichierAInclure);
		boolean Truth = fi.Truth(cheminfichier);
		if (Truth){ LNomsFichiers.add(basename(cheminfichier.getFileName().toString())); }
		return CONTINUE;
	}
	
	@Override
    public FileVisitResult visitFileFailed(Path cheminfichier,
                                       IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }

	public UtilitaireIOBaladeDansSystemeFichiers(String pattern, String chaineRepertoireAExclure) {
		// TODO Auto-generated constructor stub
		this.setPatternFichierAInclure(pattern);
		this.setLNomsFichiers();
		this.setStartingDir("C:/Users/Utilisateur/Documents/GitHub/nfa031/variablestableauxboucles");
		this.setRepertoireAExclure(chaineRepertoireAExclure);
	
	}

	
	private void setStartingDir(String startdir){
		this.StartingDir = Paths.get(startdir);
	}
	
	
	
	private void setRepertoireAExclure(String s){
		this.chaineRepertoireAExclure = s;
	}
	
	private String getRepertoireAExclure(){
		return this.chaineRepertoireAExclure;
	}
	
	private Path getStartingDir(){
		return this.StartingDir;
	}
	private void setPatternFichierAInclure(String s){
		this.patternFichierAInclure = s;
	}
	
	private void setLNomsFichiers(){
		
		this.LNomsFichiers =  new ArrayList<String>();
	}
	
	
	public List<String> GetListeNomsFichiersRespectantPattern() {
		
		// un endroit où commencer, un objet contenant les 4 méthodes filevisit....
		try {
			Path RetourCheminDepart = Files.walkFileTree(this.getStartingDir(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LNomsFichiers;
		
	}
}
