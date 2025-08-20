package Array;
import java.util.Scanner;
public class ArrayEx {
	public static void main(String[] args) {
	//Array Declaration
	int a[]=new int[5];//
	//a[0] a[1] a[2] a[3] a[4]
	//Initializing the values to the array
	/*a[0]=2;
	a[1]=3;
	a[2]=4;
	a[3]=6;
    a[4]=9;*/
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter the values for Array");
		a[i]=s.nextInt();
	}
	
	//Retrieving the data from the array
	           //j<5
	for(int j=0;j<a.length;j++)//length => 5 0 1 2 3 4
	{
		System.out.print(a[j]+ " ");
	}
	System.out.println(a.getClass().getName());
	}
			
			
			
			
			
			
	
	
	
	
	

}
