/**
 * 
 */
package branch;

import java.util.Scanner;

public class calc {
	/*
	 * 두개의 정수를 입력받아서 opcode 값이 1이면 덧셈 2면 뺄셈 3이면 곱셈 4면 나눗셈(몫) 5면 나머지 구하는 계산기
	 */
	/**
	 * @date :2016. 6. 8.
	 * @author :오승준
	 * @file :calc.java
	 * @story :
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0, a = 0;
		String numResult = " ";
		System.out.println("정수1의 값을 입력해 주세요");
		x = scanner.nextInt();
		System.out.println("정수2의 값을 입력해 주세요");
		y = scanner.nextInt();
		System.out.println("덧샘은 1, 뺄샘은2 곱샘은3 나누기는4를 입력하세요");
		int input = scanner.nextInt();
		if (input == 1) {
			a = x + y;
			numResult = "+";
		} else if (input == 2) {
			a = x - y;
			numResult = "-";
		} else if (input == 3) {
			a = x * y;
			numResult = "*";
		} else if (input == 4) {
			a = x / y;
			numResult = "/";
		} else {
			System.out.println("1~5까지만 입력바랍니다.");
			return;
		}
		System.out.println(x + "+" + y + "=" + a);
	}
}