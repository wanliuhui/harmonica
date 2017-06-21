package singleton;

import singleton.懒汉.Singleton;

public class Test {
	
	public static void main(String[] args) {
		for(long i=1;i<1001;i++){
			System.out.print(i+" ");
			if(i<10){
				System.out.print("  ");
			}else if(i<100){
				System.out.print(" ");
			}
			if(i%10==0){
				System.out.println();
			}
		}
	}
	
	
}
