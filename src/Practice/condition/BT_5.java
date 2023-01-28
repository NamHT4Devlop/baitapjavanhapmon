package Practice.condition;

import java.util.Scanner;

public class BT_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String MSSV;
		System.out.println("Nhập vào MSSV:");
		Scanner sc = new Scanner(System.in);

		MSSV = sc.nextLine(); // Nhận vào 1 chuỗi từ bàn phím

		if (MSSV.matches("B\\d{7}")) // Kiểm tra bằng biểu thức chính quy
			System.out.println("Phù hợp");
		else
			System.out.println("Không phù hợp");

		// Bài này nâng cao là vì có sử dụng biểu thức chính quy
		// tự tra Google để biết thêm về nó
	}
}
