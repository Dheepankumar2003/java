import java.util.Scanner;
public class Swapping
{  
	public static void main(String[] args)   
	{  
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		a = sc.nextInt();
		System.out.print("Enter the number :");
		b = sc.nextInt();
		System.out.println("Values before Swapping");
		System.out.println("value of A :"+a);
		System.out.println("value of B :"+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Values after Swapping");
		System.out.println("value of A :"+a);
		System.out.println("Value os B :"+b);	 
	}  
}  

	