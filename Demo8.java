package aaa;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		System.out.println("请输入你想打印乘法表的位数");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		cfb(x);
	}

	public static void cfb(int x) {
		for (int i = 1; i < x + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println("");
			System.out.println( );
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("第二次提交");
		}
	}
}