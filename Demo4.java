package aaa;

public class Demo4 {
	public static void main(String[] args) {
		int[] s = { 1, 2, 4, 7, 9 };
		int sum = sum(s);
		System.out.println(sum);
		int max = max(s);
		System.out.println(max);
		int min = min(s);
		System.out.println(min);
		geshu(s);
	}

	public static int sum(int[] s) {
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			int y = s[i];
			sum = sum + y;
		}
		//for循环加载
		//daienfnas
		//ssdangs
		return sum;
	}

	public static int max(int[] s) {
		int max = s[0];
		for (int i = 0; i < s.length; i++) {
			if (max < s[i]) {
				max = s[i];
			}
		}
		return max;
	}

	public static int min(int[] s) {
		int min = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		return min;
	}

	public static void geshu(int[] s) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] % 2 == 0) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("偶数个数是" + count1);
		System.out.println("奇数个数是" + count2);
	}
}
