/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :ArrBase.java
 * @story :배열(array)의 기초
 */
public class ArrBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] avg = new int[3];
		int[] gradeA = new int[3];
		int i = 0;
		String[] name = new String[3];
		String[] gradeN = new String[3];

		for (; i < 3; i++) {
			System.out.println("이름, 점수 입력");
			name[i] = scanner.next();
			avg[i] = scanner.nextInt();

		}

		if (avg[0] > avg[1] && avg[1] > avg[2]) {
			gradeN[0] = name[0];
			gradeA[0] = avg[0];
			gradeN[1] = name[1];
			gradeA[1] = avg[1];
			gradeN[2] = name[2];
			gradeA[2] = avg[2];

		} else if (avg[0] > avg[2] && avg[2] > avg[1]) {
			gradeN[0] = name[0];
			gradeA[0] = avg[0];
			gradeN[1] = name[2];
			gradeA[1] = avg[2];
			gradeN[2] = name[1];
			gradeA[2] = avg[1];
		} else if (avg[1] > avg[0] && avg[0] > avg[2]) {
			gradeN[0] = name[1];
			gradeA[0] = avg[1];
			gradeN[1] = name[0];
			gradeA[1] = avg[0];
			gradeN[2] = name[2];
			gradeA[2] = avg[2];
		} else if (avg[1] > avg[2] && avg[2] > avg[0]) {
			gradeN[0] = name[1];
			gradeA[0] = avg[1];
			gradeN[1] = name[2];
			gradeA[1] = avg[2];
			gradeN[2] = name[0];
			gradeA[2] = avg[0];
		} else if (avg[2] > avg[0] && avg[0] > avg[1]) {
			gradeN[0] = name[2];
			gradeA[0] = avg[2];
			gradeN[1] = name[0];
			gradeA[1] = avg[0];
			gradeN[2] = name[1];
			gradeA[2] = avg[1];
		} else {
			gradeN[0] = name[2];
			gradeA[0] = avg[2];
			gradeN[1] = name[1];
			gradeA[1] = avg[1];
			gradeN[2] = name[0];
			gradeA[2] = avg[0];
		}
		System.out.println("1등 : " + gradeN[0] + " " + gradeA[0] + "점");
		System.out.println("2등 : " + gradeN[1] + " " + gradeA[1] + "점");
		System.out.println("3등 : " + gradeN[2] + " " + gradeA[2] + "점");

	}
}
