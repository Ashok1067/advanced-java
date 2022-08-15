package Areas;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double p=3.14,area;
		float r=obj.nextFloat(); // Radius in m
		area=3.14 * r * r; // Area in m
		System.out.print(area+" "+"m^2");
	}

}
