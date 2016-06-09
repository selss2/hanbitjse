/**
 * 
 */
package branch;

import java.util.Scanner;

public class Avg {
	/**
	 * @date :2016. 6. 8.
	 * @author :오승준
	 * @file :Avg.java
	 * @story : * * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목 점수를 입력 받아서 [홍길동 : 총점
	 *        ***점, 평균***점], 합격여부 [불합격] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점 이하는
	 *        절삭합니다. 평균점수가 60점 미만이면 불합격, 이상이면 합격입니다.
	 */
	public static void main(String[] args) {
		// ----------- 변수 선언부, 준비, 초기화 (init) -----------
		Scanner scanner = new Scanner(System.in);
		String name = " ",qwe = " ";
		int kor = 0, eng = 0, math = 0, total = 0, evg = 0;
		// ---------------연산부 (알고리즘)-------------------------
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		total = kor + eng + math;
		evg = total / 3;
		if (evg >= 59) {
			qwe = "합격";
		} else {
			qwe = "불합격";
		}
		//---------------출력부(콘솔)--------------
		System.out.println(""+name+"님의 총점은"+total+"점이며, 평균은 "+evg+"입니다. 최종 "+qwe);

	}
}
