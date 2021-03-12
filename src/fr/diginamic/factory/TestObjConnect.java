package fr.diginamic.factory;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestObjConnect {

	public static void main(String[] args) {
		
		ObjetConnecte obj1 = ObjetConnecteFactory.getType(ObjConnectEnum.TELEPHONEPORTABLE, 56);
		ObjetConnecte obj2 = ObjetConnecteFactory.getType(ObjConnectEnum.ENCEINTECONNECTEE, 36);
		ObjetConnecte obj3 = ObjetConnecteFactory.getType(ObjConnectEnum.TABLETTE, 56);
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
