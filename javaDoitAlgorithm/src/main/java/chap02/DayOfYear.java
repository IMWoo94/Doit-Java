package chap02;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년 100으로 나누어떨어지고 400으로 나누어 떨어지지 않는 해
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년 4로 나누어지는 해
	};

	// 서기 year년은 윤년인가? ( 윤년 1 평년 0 )
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		// int days = d;
		//
		// for (int i = 1; i < m; i++) {
		// 	System.out.println("mdays[isLeap(y)][m] : " + mdays[isLeap(y)][i - 1]);
		// 	days += mdays[isLeap(y)][i - 1];
		// }
		m = m - 2;
		while (m >= 0) {
			d += mdays[isLeap(y)][m--];

		}
		return d;
	}

	static int leftDayOfYear(int y, int m, int d) {
		d = mdays[isLeap(y)][m - 1] - d;
		while (m < 12) {
			d += mdays[isLeap(y)][m];
			m++;
		}
		return d;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int retry;

		do {
			System.out.print("년 : ");
			int year = in.nextInt();
			System.out.println();
			System.out.print("월 : ");
			int month = in.nextInt();
			System.out.println();
			System.out.print("일 : ");
			int day = in.nextInt();
			System.out.println();

			System.out.printf("그 해 %d 일째 입니다.", dayOfYear(year, month, day));
			System.out.println();
			System.out.printf("그 해 남은 %d 일째 입니다.", leftDayOfYear(year, month, day));

			System.out.println("한번더?");
			retry = in.nextInt();
		} while (retry == 1);
	}
}
