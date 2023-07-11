package in.ashokit.Array;

import java.util.Arrays;

public class Sort {
	
	
	public static void main(String[] args) {
		
		int[]a= {1,7,6,8,9,45,3,2,4,5,3,2,34,5,6,4,3,54,67,5,4};
		
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
