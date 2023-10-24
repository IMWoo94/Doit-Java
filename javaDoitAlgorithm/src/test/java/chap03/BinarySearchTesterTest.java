package chap03;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTesterTest {

	@Test
	void 기본자료형binarySearch사용하기검색성공() {
		int[] a = {15, 27, 39, 77, 92, 108, 121};

		int idx = Arrays.binarySearch(a, 77);
		Assertions.assertEquals(idx, 3);
	}

	@Test
	void 기본자료형binarySearch사용하기검색실패() {
		int[] a = {15, 27, 39, 77, 92, 108, 121};

		int idx1 = Arrays.binarySearch(a, 16);
		Assertions.assertEquals(idx1, -2);
		int idx2 = Arrays.binarySearch(a, 98);
		Assertions.assertEquals(idx2, -6);
	}

}