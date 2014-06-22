package M90H058;

import java.math.BigDecimal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println();
		System.out.println("請輸入一整數 n :");
		int n = enter.nextInt();
		
		BigDecimal bd = new BigDecimal(function(n-1));
		bd = bd.setScale(7,BigDecimal.ROUND_HALF_DOWN);
		System.out.print("a("+n+")="+bd.doubleValue());
	}
	public static double function(int n) {
		if(n==0)
			return 1;
		else 
			return function(n-1)*(n+1)/(n+2);
	}

}
