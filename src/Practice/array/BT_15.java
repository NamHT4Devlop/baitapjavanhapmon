package Practice.array;

import java.util.Scanner;

public class BT_15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] code = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Nhập vào mã thứ " + (i + 1));
			code[i] = sc.nextLine();
			if (!code[i].matches("00[2-5]L\\d{4}")) {
				System.out.println("Sai rồi!");
				return;
			}
		}
		System.out.println("Đúng rồi!");
	}

}
