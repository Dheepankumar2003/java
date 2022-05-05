import java.util.Scanner;
public class stringvowels{
	public static void main(String[] args){
	System.out.println("Enter the String :");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("The String is :"+str);
	for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	\\if(str.charAt(i)==" " && str.charAt(i+1)!=" ")
	\\break;
	\\else{
	\\System.out.println("ooooo");
	\\}
	System.out.println("Vowel "+str.charAt(i));
	}
    }
}
}