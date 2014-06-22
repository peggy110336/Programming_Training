package M90H059;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println();
		System.out.println("請輸入一整數 n :");
		int n = enter.nextInt();
		
		BigDecimal bd = new BigDecimal(function(n-1));
		bd = bd.setScale(5,BigDecimal.ROUND_HALF_DOWN);
		if(bd.doubleValue()==1.0)
			System.out.print("a("+n+")=1");
		else
			System.out.print("a("+n+")="+bd.doubleValue());
	}
	public static double function(int n) {
		if(n==0)
			return 3;
		else 
			return (function(n-1)*4+1)/5;
	}

}