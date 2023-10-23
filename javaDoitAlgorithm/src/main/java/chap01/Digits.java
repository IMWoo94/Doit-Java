package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no;

		System.out.println("2자리 정수를 입력해주세요.");
		do {
			System.out.println("입력 :");
			no = in.nextInt();
		} while (no < 10 || no > 99);

		System.out.println("변수 no 의 값은 " + no + "가(이) 되었습니다.");
	}

	/**
	 * 드모르간 법치
	 * " 각 조건을 부정하고 논리곱(&&) 을 논리합(||) 으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다 "
	 * x && y == !(!x || !y) // x || y == !(!x && !y)
	 */
}
