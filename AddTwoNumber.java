import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[]args){
	 Scanner scanner=new Scanner(System.in);
	 
	 System.out.print("Enter first num:");
	 int num1=scanner.nextInt();

	 System.out.print("Enter Second Num:");
	 int num2=scanner.nextInt();
	
	 int sum=num1+num2;
	 System.out.println("The sum is:"+sum);
    }
}