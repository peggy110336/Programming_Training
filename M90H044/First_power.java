
import java.util.*;
public class First_power {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		//System.out.println();
		System.out.println("請輸入一整數n:");
		n = enter.nextInt();
		System.out.println("答案為"+firstpower(n));
	}
	public static int firstpower(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
