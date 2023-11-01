package chap04;

public class IntStack {
	private int max;    // 스택 용량
	private int ptr;    // 스택 포인터
	private int[] stk;    // 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmtpyIntStackException extends RuntimeException {
		public EmtpyIntStackException() {
		}
	}

	// 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}

	public int pop() throws EmtpyIntStackException {
		if (ptr <= 0) {
			throw new EmtpyIntStackException();
		}
		return stk[--ptr];
	}

	public int peek() throws EmtpyIntStackException {
		if (ptr <= 0) {
			throw new EmtpyIntStackException();
		}
		return stk[ptr - 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		for (int i = ptr - 1; i >= 0; i--) {
			stk[i] = 0;
		}
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
