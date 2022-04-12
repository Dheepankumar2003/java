import java.util.Scanner;  
public class SumOfNumbers21  
{  
public static void main(String args[])  
{  
int x, y, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
System.out.println("The first number :"+ x);  
System.out.println("The second number :"+ y); 
sum = x + y;
System.out.println("The sum of two numbers x and y is: " + sum);  
}    
}  