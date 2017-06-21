package singleton.双重校验锁;

public class Singleton {
	 private volatile static Singleton singleton; 
	 
    private Singleton (){}  
    
    public static synchronized Singleton getInstance() {  
    	
	    if (singleton == null) {
	    	
	        synchronized (Singleton.class) { 
	        	
		        if (singleton == null) {  
		        	
		            singleton = new Singleton();  
		            
		        }  
	        
	        }  
	        
	    }  
	    
	    return singleton;  
	    
    }  
}
