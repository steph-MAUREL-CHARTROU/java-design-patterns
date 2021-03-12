package fr.diginamic.singleton;
import java.util.ResourceBundle;
/**
 * 
 * @author StephanieMC
 *
 */
public class Singleton {
	
	public static Singleton instance = new Singleton();
	
	 private ResourceBundle configuration;
	
	private Singleton() {
		configuration = ResourceBundle.getBundle("configuration");
		
	}
	
	public static Singleton getInstance() {
		
		return instance;
	}
	
	public String getValue( String key) {
		
	String keyValue = configuration.getString("db_user");
		
		
		return keyValue;
	}

}
