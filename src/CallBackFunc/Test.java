package CallBackFunc;

import java.util.Date;

public class Test {

	 public static void main(String[] args) {  
		 Test test = new Test();
		 test.callback(new MyCallInterface() {
			
			@Override
			public void printName() {
				long l = 1000000000L;
				int n =0;
				for (int i = 0; i < l; i++) {
					n+=i;
				}
				System.out.println(n);
			}
		});
	        
	    } 
	
	 
	 public void callback(MyCallInterface mi){
		 Long l = System.currentTimeMillis();
		 mi.printName();
		 Long t = System.currentTimeMillis();
		 System.out.println(t-l);
	 }
}