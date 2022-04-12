import java.util.Scanner;
class Fibonacciseries{  
	public static void main(String args[])  
	{    
		int n1,n2,n3,i,count=10;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number :");
		n1 = sc.nextInt();
		System.out.print("Enter the Second number :");
		n2 = sc.nextInt();    
		System.out.print(n1+" "+n2);   
		for(i=2;i<count;++i)
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
 		}    
	}
}

	