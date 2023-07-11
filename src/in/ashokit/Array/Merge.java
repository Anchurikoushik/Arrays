package in.ashokit.Array;

import java.util.Arrays;

public class Merge {
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,9};
		
		int[]b= {4,5,4,6,8,6,4,5,87,5,5,7,9,5,3,2,2,6,7,9,7,6};
		
		int[]c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			
		}
		
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
			
			
		}
		System.out.println(Arrays.toString(c));
		
	}

}
