package user;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :오승준
 * @file   :VarEx2.java
 * @story  :정수타입 int 빼기 예제
 */
public class VarEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 x : [  ]");
		int x = 0, y = 0, z = 0;
		x = scanner.nextInt();
		System.out.println("정수 y : [   ]");
		y = scanner.nextInt();
		z = x - y;
		System.out.println("x - y =" + z);
	}
}
