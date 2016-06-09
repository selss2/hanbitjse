/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author :오승준
 * @file :calc2.java
 * @story : /* 두개의 정수를 입력받아서 opcode 값이 1이면 덧셈 2면 뺄셈 3이면 곱셈 4면 나눗셈(몫) 5면 나머지 구하는
 *        계산기
 */
public class calc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0, count = 0, num_result = 0;
		String symbol = "";
		System.out.print("첫번째숫자 : ");
		num1 = scanner.nextInt();
		System.out.print("연산자 1입력시:+, 2입력시:-, 3입력시:*, 4입력시:/, 5입력시 %");
		System.out.print("연산자 : ");
		count = scanner.nextInt();
		System.out.print("두번째숫자 : ");
		num2 = scanner.nextInt();
		if (count == 1) {
			symbol = "+";
			num_result = num1 + num2;
		} else if (count == 2) {
			symbol = "-";
			num_result = num1 - num2;
		} else if (count == 3) {
			symbol = "*";
			num_result = num1 * num2;
		} else if (count == 4) {
			symbol = "/";
			num_result = num1 / num2;
		} else if (count == 5) {
			symbol = "%";
			num_result = num1 % num2;
		} else {
			System.out.println("1~5까지만 입력바랍니다.");
			return;
		}
		System.out.println(num1 + symbol + num2 + "=" + num_result);
	}
}
