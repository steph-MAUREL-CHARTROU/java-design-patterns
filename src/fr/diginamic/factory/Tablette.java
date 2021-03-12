package fr.diginamic.factory;
/**
 * 
 * @author StephanieMC
 *
 */

public class Tablette extends ObjetConnecte{

	public Tablette(int limitVols) {
		super(limitVols);
		
	}

	@Override
	public String toString() {
		return "Tablette : limitVols : " + limitVols ;
	}
	
	

	}

