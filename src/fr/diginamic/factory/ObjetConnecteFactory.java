package fr.diginamic.factory;

/**
 * 
 * @author StephanieMC
 *
 */

public class ObjetConnecteFactory {

	public static ObjetConnecte getType(ObjConnectEnum type, int limitVolts) {

		if (type.equals(ObjConnectEnum.TELEPHONEPORTABLE)) {

			return new TelephonePortable(limitVolts);

		} else if (type.equals(ObjConnectEnum.ENCEINTECONNECTEE)) {

			return new EnceinteConnectee(limitVolts);

		} else if (type.equals(ObjConnectEnum.TABLETTE)) {

			return new Tablette(limitVolts);

		}
		return null;

	}
}
