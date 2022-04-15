import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner obj=new Scanner(System.in);
		int limit=obj.nextInt();
		System.out.println("enter the values in array a");
		int[][] a=getarray(limit,obj);
		System.out.println("enter the values in array b");
		int[][] b=getarray(limit,obj);
		System.out.println("sum of array a & b is");
		int[][] c=sum(limit,a,b);
		display(c);
		
	}
	public static int[][] getarray(int limit1,Scanner obj) {
		int a[][] = new int[limit1][limit1];
		for(int i=0;i<limit1;i++){
			for(int j=0;j<limit1;j++) {
			a[i][j]=obj.nextInt();
			}
					
		}
		return a;
	}
	public static int[][] sum(int limit1,int[][] a,int[][] b) {
		int c[][] = new int[limit1][limit1];
		for(int i=0;i<limit1;i++){
			for(int j=0;j<limit1;j++) {
			c[i][j]=a[i][j]+b[i][j];
			}
					
		}return c;

	
	}
	public static void display(int[][] b) {
	
		for(int i=0;i<b.length;i++) {for(int j=0;j<b.length;j++) {
			System.out.print("\t"+b[i][j]);
		}
		System.out.println();
					
		}
		
		
	}

}
