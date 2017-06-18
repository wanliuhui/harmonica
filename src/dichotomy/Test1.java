package dichotomy;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] a={1,21,32,9,424,4245,6,8,843,1,211};
		
		a = bubble(a);
		
		int index = dichotomy(a,424);
		
		System.out.println(index);
		
	}
	private static int dichotomy(int[] a,int T) {
		
		int mid;
		
		int high = a.length-1;
		
		int low = 0;
		
		while(low<=high){
			
			mid = (high+low)/2;
			
			if(T < a[mid]){
				
				high = mid - 1;
				
			}else if(T>a[mid]){
				
				low = mid + 1;
				
			}else{
				return mid;
			}
		}
		
		return -1;
		
	}
	
	public static int[] bubble(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]){
					
					int tem = a[i];
					
					a[i] = a[j];
					
					a[j] = tem;
					
				}
				
			}
			
		}
		
		for (int i : a) {
			
			System.out.print(i+",");
			
		}
		
		return a;
		
	}
	
}
