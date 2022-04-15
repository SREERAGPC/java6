package array15;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
		System.out.println("enter size of array");
		Scanner obj=new Scanner(System.in);
		int limit=obj.nextInt();
		System.out.println("enter the values in array");
		int[] a=getarray(limit,obj);
		System.out.println("entered values of array are");
		display(a);
		
	}
	public static int[] getarray(int limit1,Scanner obj) {
		int a[] = new int[limit1];
		for(int i=0;i<limit1;i++) {
			a[i]=obj.nextInt();
					
		}
		return a;
	}
	public static void display(int[] b) {
	
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
					
		}
	
	}


}

