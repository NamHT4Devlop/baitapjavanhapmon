package Practice.loop;

import java.util.Scanner;

public class BT_9 {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		int n;
		int Fi;
		System.out.println("Nhập vào số nguyên:");
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		Fi = CalculateFi(n);

		System.out.println("Fi(" + n + ") = " + Fi);
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	private static int CalculateFi(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return CalculateFi(n - 1) + CalculateFi(n - 2);
	}
}
