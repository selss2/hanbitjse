/**
 * 
 */
package controller;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :Controller.java
 * @story :
 */
public class Controller {
	public static void main(String[] args) {
		String menu = "";
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		kaup kaup = new kaup();

		while (true) {
			menu = JOptionPane.showInputDialog("1. 계산기" + "2. 카우푸" + "3. 년월말 구하기" + "4. 1등 구하기" + "5. 학번/나이"
					+ "6. 최고최저 점수" + "7. 세금액" + "8. 성별판별" + "9. 시분초 구하기" + "0. 종료 ");
			switch (menu) {
			case "1":
				calc(s);
				System.out.print("첫번째숫자 : ");
				System.out.print("기호를 입력하세요");
				System.out.print("연산자 : ");
				System.out.print("두번째숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				kaup(s);
				System.out.println("이름을 입력해주세요 : ");
				System.out.println("키를 입력해주세요 : ");
				System.out.println("몸무게를 입력해주세요 : ");
				System.out.println(kaup.inputkaup(s.next(), s.nextDouble(), s.nextDouble()));
				break;
			case "3":
				monthend(s);
				System.out.println("년 입력?(예)2016");
				System.out.println("월 입력?(예)2");
				if () {
					System.out.println("잘못 입력 되었습니다");
				} else {
					System.out.printf("%d%s%d%s%d%s", year, "년", month, "월", day, "일");

				}

				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showInputDialog(null, "메뉴에 없는 번호입니다.");
				System.out.println("1. 계산기 / 2. 카우푸 구하기 / 3. 년월말 구하기 / 0. 종료");
				break;
			}
		}
	}

	private static void monthend(Scanner s) {
		int day = 0, year = 2016;
		System.out.println("년 입력?(예)2016");
		year = s.nextInt();
		System.out.println("월 입력?(예)2");
		int month = 2;
		switch (s.nextInt()) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.out.println("잘못 입력 되었습니다\n");
			return;
		}
		System.out.printf("%d%s%d%s%d%s", year, "년", month, "월", day, "일\n");
	}

	private static void kaup(Scanner s) {
		String name = "", result = "";
		double tall = 0.0, weight = 0.0, kaup = 0.0;
		System.out.println("이름을 입력해주세요 : ");
		name = s.next();
		System.out.println("키를 입력해주세요 : ");
		tall = s.nextDouble();
		System.out.println("몸무게를 입력해주세요 : ");
		weight = s.nextDouble();
		kaup = weight / (tall / 100) / (tall / 100);
		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.5 && kaup <= 22.9) {
			result = "정상체중";
		} else if (kaup >= 23.0 && kaup <= 24.9) {
			result = "위험체중";
		} else if (kaup >= 25.0 && kaup <= 29.9) {
			result = "비만1단계";
		} else if (kaup >= 30.0 && kaup <= 39.9) {
			result = "비만2단계";
		} else if (kaup >= 40.0) {
			result = "비만3단계";
		}
		System.out.println(name + "님은" + result + "입니다\n");
	}

	private static void calc(Scanner s) {
	}
}
