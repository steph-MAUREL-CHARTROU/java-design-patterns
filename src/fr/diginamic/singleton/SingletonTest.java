package fr.diginamic.singleton;
/**
 * 
 * @author StephanieMC
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		String user = singleton.getValue("db_user");
		
		System.out.println(user);
		
	}

}
