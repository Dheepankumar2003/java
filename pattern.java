import java.util.Scanner;
public class pattern{  
	public static void main(String args[])  
	{    
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row :");
		row = sc.nextInt();
		for(i=0;i<row;i++)
		{
		for(j=0;j<=i;j++)
		{    
		System.out.print("*");   
		}    
		System.out.println();	   
 		}    
	}
}

	