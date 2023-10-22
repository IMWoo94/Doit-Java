package chap01;

public class Max3m {
	// a,b,c 의 최댓값을 구하여 반환한다.
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}
}
