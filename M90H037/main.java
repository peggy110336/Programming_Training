import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		double x1,y1,x2,y2;
		System.out.println();
		System.out.println("請輸入第一點(x,y):");
		System.out.println("請輸入第二點(x,y):");
		x1 = enter.nextDouble();
		y1 = enter.nextDouble();
		x2 = enter.nextDouble();
		y2 = enter.nextDouble();
		System.out.printf("距離為%.4f",distance(x1, y1, x2, y2));

	}
	
	public static double distance(double x1,double y1,double x2,double y2) {
		
		double x = Math.pow((x1-x2),2);
		double y = Math.pow((y1-y2),2);
		
		return Math.sqrt(x+y);
	}

}
