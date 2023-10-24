package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	// 신체검사 데이터를 정의합니다.
	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhyscData{" +
				"name='" + name + '\'' +
				", height=" + height +
				", vision=" + vision +
				'}';
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.height > o2.height) ? 1 :
					(o1.height < o2.height) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("이나령", 162, 0.3),
			new PhyscData("유지훈", 168, 0.4),
			new PhyscData("김한결", 169, 0.8),
			new PhyscData("홍준기", 172, 1.5)
		};

		System.out.println("몇 cm 인 사람을 찾고 있나오?");
		int key = in.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", key, 0.0), PhyscData.HEIGHT_ORDER);

		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다 : " + idx);
		} else {
			System.out.println(key + " 은 x[" + idx + "]에 있습니다.");
			System.out.println(x[idx]);
		}

		System.out.println("시력 입력");
		double vision = in.nextDouble();

		int idxVision = Arrays.binarySearch(x, new PhyscData("", 0, vision),
			new Comparator<PhyscData>() {
				@Override
				public int compare(PhyscData o1, PhyscData o2) {
					return (o1.vision > o2.vision) ? 1 :
						(o1.vision < o2.vision) ? -1 : 0;
				}
			}
		);

		if (idxVision < 0) {
			System.out.println("그 값의 요소가 없습니다 : " + idxVision);
		} else {
			System.out.println(vision + " 은 x[" + idxVision + "]에 있습니다.");
			System.out.println(x[idxVision]);
		}

	}

}
