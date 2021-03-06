/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :오승준
 * @file :Tax2.java
 * @story :
 */
public class Tax2 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 연봉을 입력받아서 연봉 ***만원을 받으시는 xxx님께서 납부할 세금은
	 * ???만원입니다. 로 출력하는 프로그램을 만들어 주세요. 단) 세율이 정책이 바뀔 때 마다 변하니, 관리자가 쉽게 적용가능하도록
	 * 만들어 주세요. 현재는 세율이 9.7프로라고 합니다.
	 */
	public static void main(String[] args) {
		// 지역변수 초기화 : 변수값의 그 타입에 맞는 기본값을 할당하는
		// 단 스캐너로 입력 받을 시 생략가능
		Scanner scanner = new Scanner(System.in);
		int sal = 0, tax = 0;
		System.out.println("이름을 입력하세요 [   ]");
		String name = scanner.next();
		System.out.println("연봉을 입력하세요 [   ]");
		sal = scanner.nextInt();
		System.out.println("세율이 바뀌었습니까?" + "그대로라면 1, 아니시라면 2를 입력하세요");
		int input = scanner.nextInt();
		if (input == 1) {
			double taxRate = 0.097;
			tax = (int) (sal * taxRate);
			System.out.println("연봉 " + sal + "만원을 받으시는 " + name + "님께서 " + "납부할 세금은 " + tax + "만원입니다.");
		} else {
			System.out.println("바뀐 세율을 입력해주십시오");
			double taxRate = scanner.nextDouble();
			tax = (int) (sal * taxRate);
			System.out.println("연봉 " + sal + "만원을 받으시는 " + name + "님께서 " + "납부할 세금은 " + tax + "만원입니다.");
		}
	}

}
