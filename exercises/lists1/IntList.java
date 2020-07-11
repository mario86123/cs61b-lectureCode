public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		} else {
			return rest.size() + 1;
		}
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList ptr = this;
		int size = 0;
		while (ptr != null) {
			size += 1;
			ptr = ptr.rest;
		}
		return size;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		IntList ptr = this;
		for (int k = 0; k < i; k += 1) {
			ptr = ptr.rest;
		}
		return ptr.first;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);
		System.out.println(L.size());
		System.out.println(L.iterativeSize());
		System.out.println(L.rest.size());
		System.out.println(L.rest.iterativeSize());
		System.out.println(L.get(0));
		System.out.println(L.get(1));
	}
} 