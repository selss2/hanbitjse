/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author :오승준
 * @file :MonthEnd.java
 * @story :
 */
public class MonthEnd2 {
	/**
	 * 월을 입력하면 말일이 몇일이 알려주는 프로그램 단, 2월은 29일로 한정함. 1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다
	 * 라고 뜬다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = 0, day = 0;
		System.out.println("월일 입력하세요");
		scanner.next();
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:day = 31;
		case 4:

			break;

		default:
			break;
		}
	}
}
