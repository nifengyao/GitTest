package aaa;

public class Demo1 {
	public static void main(String[] args) {
		int b;
		int j = 0;
		for (int i = 1; i <= 100; i++) {
			b = i % 7;
			if (b == 0) {
				System.out.println(i);
				j = j + 1;

			}

		}
		System.out.println("geshu " + j);
	}
}
