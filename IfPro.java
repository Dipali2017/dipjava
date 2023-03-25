package Java;
import java.util.Scanner;
public class IfPro {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
				System.out.print("Enter any NUmber:");
				int n=in.nextInt();
				if (n>0) {
					System.out.print(n+"is positive");
				}
				if (n<0) {
					System.out.print(n+"is negative");
				}
				else {
					System.out.print(n+"is zero");;
				}

	}

}
