package �{���]�p���V��;
import java.util.*;
public class Square_Sum {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		//System.out.println();
		System.out.println("�п�J�@���n:");
		n = enter.nextInt();
		System.out.println("���׬�"+Square(n));
	}
	public static int Square(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}

}
