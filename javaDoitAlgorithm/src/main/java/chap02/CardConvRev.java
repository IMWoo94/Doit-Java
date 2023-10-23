package chap02;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";

		System.out.printf("%2d|%6d\n", r, x);
		System.out.println("  +------");
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			System.out.printf("%2d|%6d ***%2d\n", r, x, x % r);
			System.out.println("  +------");
		} while (x != 0);
		System.out.printf("   %6d ***%2d\n", x, 1);
		return digits;
	}

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i > digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i + 1];
			d[digits - i + 1] = temp;
		}

		return digits;
		//2 진수로는 111011 입니다.
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10 진수를 기수 변환 합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				no = in.nextInt();
			} while (no < 0);

			do {
				System.out.println("어떤 진수로 변환할 까요? ( 2 ~ 36 )");
				cd = in.nextInt();
			} while (cd < 2 || cd > 36);

			// dno = cardConvR(no, cd, cno);
			//
			// System.out.print(cd + " 진수로는 ");
			// for (int i = dno - 1; i >= 0; i--) {
			// 	System.out.print(cno[i]);
			// }

			dno = cardConv(no, cd, cno);

			System.out.print(cd + " 진수로는 ");
			for (int i = 0; i <= dno - 1; i++) {
				System.out.print(cno[i]);
			}
			System.out.println(" 입니다.");

			System.out.print("한번 더 할가요? ( 1: 예, 2: 아니오) :");
			retry = in.nextInt();
		} while (retry == 1);
	}
}
