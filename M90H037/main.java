import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		double x1,y1,x2,y2;
		System.out.println();
		System.out.println("�п�J�Ĥ@�I(x,y):");
		System.out.println("�п�J�ĤG�I(x,y):");
		x1 = enter.nextDouble();
		y1 = enter.nextDouble();
		x2 = enter.nextDouble();
		y2 = enter.nextDouble();
		System.out.printf("�Z����%.4f",distance(x1, y1, x2, y2));

	}
	
	public static double distance(double x1,double y1,double x2,double y2) {
		
		double x = Math.pow((x1-x2),2);
		double y = Math.pow((y1-y2),2);
		
		return Math.sqrt(x+y);
	}

}
