/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :ArrAssign.java
 * @story :
 */
public class ArrAssign {
	public static void main(String[] args) {
		/**
		 * 전교생이 5명인 학생의 이름과 나이를 입력받고, 이것을 출력하세요
		 **/
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		int i = 0;
				
		System.out.println("이름과 나이를 입력하세요 : ");
		for (; i < age.length; i++) {
			name[i] = scanner.next();
			age[i] = scanner.nextInt();
		}
		for (i=0 ; i < age.length; i++) {
			System.out.println(name[i] + "님의 나이는 = " + age[i] + "입니다.");
		}
}
}
