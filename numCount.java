import java.util.Scanner;
public class numCount
{
public static void main(String args[])
{
int count = 0,num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
num = sc.nextInt();
while(num!=0){
num = num/10;
++count;
}
System.out.println("No.of digits"+count);
}
}
