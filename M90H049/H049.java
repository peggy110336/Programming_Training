package 程式設計培訓營;
import java.util.*;
public class H049 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		//System.out.println();
		System.out.println("Enter n:");
		n = enter.nextInt();
		System.out.println("Answer is "+count(n));

	}
	public static int count(int n) {
		int sum = 0;
		for(int i=1;i<=n-1;i++) {
			sum+=i*(i+1);
		}
		return sum;
	}

}
