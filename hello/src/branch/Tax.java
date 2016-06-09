/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :오승준
 * @file :Tax.java
 * @story :
 */
public class Tax {

	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 연봉을 입력받아서 연봉 ***만원을 받으시는 xxx님께서 납부할 세금은
	 * ???만원입니다. 로 출력하는 프로그램을 만들어 주세요. 현재는 세율이 9.7프로인데, 만약 세율이 바뀌면 바뀐 세율을
	 * 적용바랍니다.
	 */
	public static void main(String[] args) {
		// 지역변수 초기화 : 변수값의 그 타입에 맞는 기본값을 할당하는
		// 단 스캐너로 입력 받을 시 생략가능
		Scanner scanner = new Scanner(System.in);
		int sal = 0, change = 0, tax = 0;
		double taxRate = 0.0;
		System.out.println("이름을 입력하세요 [   ]");
		String name = scanner.next();
		System.out.println("연봉을 입력하세요 [   ]");
		sal = scanner.nextInt();
		System.out.println("세율이 바뀌었습니까?" + "그대로이면 1, 바뀌었으면 2 을 입력하세요");
		change = scanner.nextInt();
		if (change == 1) {
			taxRate = 0.097;
			System.out.println("연봉 " + sal + "만원을 받으시는 " + name + "님께서 " + "납부할 세금은 " + tax + "만원입니다.");

		} else {
			System.out.println("그럼, 바뀔 세율을 입력바랍니다");
			taxRate = scanner.nextDouble();
			System.out.println("연봉 " + sal + "만원을 받으시는 " + name + "님께서 " + "납부할 세금은 " + tax + "만원입니다.");
		}
		tax = (int) (sal * taxRate);

	}
}
