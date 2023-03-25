package Java;

public class JumpStatement {

	public static void main(String[] args) {
		int n=8;
		for (int i=1;i<=6;++i) {
			if(i==9) {
				continue;
			}
			System.out.println(i+" "+(n-i));
			}
		}

	}


