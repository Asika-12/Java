import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter a Number:");
		int num= scanner.nextInt();

		if(num%2==0) {
		System.out.println(num+"is Even");
		} else {
	   	   System.out.println(num+"is odd");
	   	   }
	}
}
   