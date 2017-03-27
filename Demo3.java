package aaa;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("请输入月份");
			int a = scanner.nextInt();
			switch (a) {
			case 12:
			case 1:
			case 2:
				System.out.println("你输入的月份是冬季");

				break;
			case 3:
			case 4:
			case 5:
				System.out.println("你输入的月份是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("你输入的月份是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("你输入的月份是秋季");
			default:
				System.out.println("你输入的是假月份");
				break;
			}

			System.out.println("是否要退出");
			System.out.println("退出输入0" + "继续输入1");
			int tc = scanner.nextInt();
			if (tc == 0) {
				break;
			}
		}
	}
}
