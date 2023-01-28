package Practice.condition;

import java.util.Scanner;

public class BT_3 {
	public static void main(String[] args) {
		float a, b, c;
		System.out.println("Nhập vào 3 số:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		if (a + b > c && b + c > a && c + a > b)
			System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
		else
			System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
	}
}
