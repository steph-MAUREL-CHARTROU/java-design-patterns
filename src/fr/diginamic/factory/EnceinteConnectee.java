package fr.diginamic.factory;
/**
 * 
 * @author StephanieMC
 *
 */

public class EnceinteConnectee extends ObjetConnecte {

	public EnceinteConnectee(int limitVols) {
		super(limitVols);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Enceinte connectée : limitVols : " + limitVols ;
	}

	

}
