package aaa;

public class Demo5 {
	public static void main(String[] args) {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 7, 7, 7, 5, 4,
				3, 3, 8, 9, 0, 12, 3, 5, 65 };
		sadf(score);
	}

	public static void sadf(int[] score) {
		int[] count = new int[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}

		for (int i = 0; i < score.length; i++) {
			int s = score[i];
			switch (s) {
			case 0:
				count[0]++;

				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;

			default:
				break;
			}

		}

		System.out.println("0出现的个数" + count[0]);
		System.out.println("1出现的个数" + count[1]);

		System.out.println("2出现的个数" + count[2]);

		System.out.println("3出现的个数" + count[3]);

		System.out.println("4出现的个数" + count[4]);

		System.out.println("5出现的个数" + count[5]);

		System.out.println("6出现的个数" + count[6]);

		System.out.println("7出现的个数" + count[7]);

		System.out.println("8出现的个数" + count[8]);

		System.out.println("9出现的个数" + count[9]);

	}

}
