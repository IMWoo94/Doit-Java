package chap02;

import java.time.LocalDate;
import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (PhyscData physcData : dat) {
			sum += physcData.height;
		}
		return sum / dat.length;
	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;
		for (PhyscData physcData : dat) {
			if (physcData.vision >= 0.0 && physcData.vision <= VMAX / 10.0) {
				dist[(int)(physcData.vision * 10)]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		PhyscData[] x = {
			new PhyscData("A", 162, 0.3),
			new PhyscData("B", 173, 0.7),
			new PhyscData("C", 175, 2.0),
			new PhyscData("D", 171, 1.5),
			new PhyscData("E", 168, 0.4),
			new PhyscData("F", 174, 1.2),
			new PhyscData("G", 169, 0.8)

		};
		int[] vdist = new int[VMAX];

		System.out.println("신체 검사 리스트");
		System.out.println("이름     키    시력");
		System.out.println("================");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

		distVision(x, vdist);

		System.out.println("시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f ~ : ", i / 10.0);
			for (int k = 0; k < vdist[i]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		YMD ymd = new YMD(2023, 10, 23);
		YMD after = ymd.after(4);
		System.out.println(after.toString());
		YMD before = ymd.before(10);
		System.out.println(before.toString());

	}

	static class YMD {
		int y;
		int m;
		int d;

		public YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}

		public YMD after(int n) {
			LocalDate localDate = LocalDate.of(this.y, this.m, this.d);
			LocalDate afterDate = localDate.plusDays(n);

			return new YMD(afterDate.getYear(), afterDate.getMonthValue(), afterDate.getDayOfMonth());
		}

		public YMD before(int n) {
			LocalDate localDate = LocalDate.of(this.y, this.m, this.d);
			LocalDate afterDate = localDate.minusDays(n);

			return new YMD(afterDate.getYear(), afterDate.getMonthValue(), afterDate.getDayOfMonth());
		}

		@Override
		public String toString() {
			return "YMD{" +
				"y=" + y +
				", m=" + m +
				", d=" + d +
				'}';
		}
	}
}
