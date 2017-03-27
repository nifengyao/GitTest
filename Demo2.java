package aaa;

import java.util.Scanner;


public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double a = scanner.nextDouble();
		System.out.println("请输入第二个数");
		double b = scanner.nextDouble();

		double max = getMax(a, b);
		System.out.println("最大的是"+max);
		
		compare(a, b);
		if(compare(a, b)==true) {
			System.out.println("两个数相等");
		}else{
			System.out.println("两个数不相等");
		}
	}

	public static double getMax(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static boolean compare(double a, double b) {
		if (a == b) {
			return true;

		} else {
			return false;
		}
	}

}
