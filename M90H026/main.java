package M90H026;

import java.text.NumberFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits( 4 );
		
		System.out.println();
		System.out.println("請輸入三角形之三個點A,B,C:");
		
		double x1,x2,x3,y1,y2,y3;
		x1 = enter.nextDouble();
		y1 = enter.nextDouble();
		x2 = enter.nextDouble();
		y2 = enter.nextDouble();
		x3 = enter.nextDouble();
		y3 = enter.nextDouble();
		
		System.out.print("面積為"+nf.format( area(x1, y1, x2, y2, x3, y3) ));

	}
	public static double area(double x1,double y1,double x2,double y2,double x3,double y3) {
		double a = Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) ); 
		double b = Math.sqrt( Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2) );
		double c = Math.sqrt( Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2) );
		
		double S = (a+b+c)/2;
		double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
		
		return area;
	}

}
