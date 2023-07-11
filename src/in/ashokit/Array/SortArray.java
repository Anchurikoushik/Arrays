package in.ashokit.Array;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[]a= {8,6,7,9,0,5,3,4,2,1};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
