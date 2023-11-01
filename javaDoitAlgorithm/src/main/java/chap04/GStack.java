package chap04;

public class GStack<E> {
	private int max;    // 스택 용량
	private int ptr;    // 스택 포인터
	private E[] stk;    // 스택 본체

	public GStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[])new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public E push(E x) throws OverflowGStackException {
		if (ptr >= max) {
			throw new OverflowGStackException();
		}
		return stk[ptr++] = x;
	}

	public E pop() throws EmtpyGStackException {
		if (ptr <= 0) {
			throw new EmtpyGStackException();
		}
		return stk[--ptr];
	}

	public E peek() throws EmtpyGStackException {
		if (ptr <= 0) {
			throw new EmtpyGStackException();
		}
		return stk[ptr - 1];
	}

	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		for (int i = ptr - 1; i >= 0; i--) {
			stk[i] = null;
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
