package 程式設計培訓營;
import java.util.*;
public class Square_Sum {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		//System.out.println();
		System.out.println("請輸入一整數n:");
		n = enter.nextInt();
		System.out.println("答案為"+Square(n));
	}
	public static int Square(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}

}
