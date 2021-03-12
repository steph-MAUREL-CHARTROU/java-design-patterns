package fr.diginamic.factory;

/**
 * 
 * @author StephanieMC
 *
 */
public class TelephonePortable extends ObjetConnecte {

	public TelephonePortable(int limitVols) {
		super(limitVols);

	}
	
	

	@Override
	public String toString() {
		return "TelephonePortable : limitVols : " + limitVols ;
	}

	
}
