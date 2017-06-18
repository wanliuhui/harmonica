package singleton;

import singleton.枚举.Singleton;

public class Test {
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.INSTANCE;
		
		Singleton s2 = Singleton.INSTANCE;
		
		System.out.println(s1==s2);
	}
	
	
}
