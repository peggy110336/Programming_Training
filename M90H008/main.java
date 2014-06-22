package M90H008;

import java.text.NumberFormat;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits( 5 );
		System.out.println();
		System.out.println("請輸入一整數:");
		int x = enter.nextInt();
		
		System.out.print("f(f(f("+x+")))="+nf.format( function(x) ));
	}
	public static double function(double x) {
		for(int i=0;i<3;i++) {
			x = (x+3)/(x+2);
		}
		return x;
	}

}
