package singleton.饿汉;

public class Singleton {
	private static Singleton instance = new Singleton();
	/*  
	 * 另一种写法 
	 private static Singleton instance = null;
	 
	 static{
	 
	 	instance = new Singleton()
	 
	 }
	 
	 */
	private Singleton(){
		
	}
	
	/**
	 * hfaofoaufo
	 * @return
	 */
	public static Singleton getInstance(){
		return instance;
	}
}
