import java.util.Scanner;
public class Average
{
	public static void main(String[] args)
	{
		int m,c,p,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maths mark :");
		m = sc.nextInt();
		System.out.println("Enter the chemistry mark :");
		c = sc.nextInt();
		System.out.println("Enter the physics mark :");
		p = sc.nextInt();
		System.out.println("Maths mark :"+m);
		System.out.println("Chemistry mark :"+c);
		System.out.println("Physics mark :"+p);
		avg=(m+c+p)/3;
		System.out.println("The Average Of Marks :"+avg);
	}
}

	