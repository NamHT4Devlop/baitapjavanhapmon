package Practice.string;

import java.util.Scanner;

public class BT_20 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String chuoi;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào một chuỗi: ");
		chuoi = sc.nextLine();

		if (chuoi.matches("^[A-Z][^\\s]{0,18}\\d$"))
			System.out.println("Duyệt");
		else
			System.out.println("Không duyệt");
	}
}
