package Java;

public class ForEach {

	public static void main(String[] args) {
		int[] marks= {321,567,43,590,561};
		int max=marks[0];
		for (int num:marks) {
			if (num<max) {
				max=num;
			}
		}
		System.out.print("Student Highest score is"+max);;
			}
		}

	
