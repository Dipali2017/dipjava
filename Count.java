package Java;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number:");
		int no=sc.nextInt();
		int count=0;
		while (no>0) {
			no=no/19;
			++count;
		}
		System.out.print("The Number of Digits is"+count);
		}

	}


