/**
 * 
 */
package branch;

import java.util.Scanner;

public class Avg2 {
	/**
	 * @date :2016. 6. 8.
	 * @author :오승준
	 * @file :Avg.java
	 * @story : * * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목 점수를 입력 받아서 [홍길동 : 총점
	 *        ***점, 평균***점, 학점 : ]을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점 이하는 절삭합니다.
	 *        평균점수가 90점 이상 A 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점
	 *        미만이면 F 학점입니다라고 출력되게 해주세요
	 */
	public static void main(String[] args) {
		// ----------- 변수 선언부, 준비, 초기화 (init) -----------
		Scanner scanner = new Scanner(System.in);
		String name = " ", qwe = " ";
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
		if (kor > 100||eng>100||math>100||kor<0||eng<0||math<0) {
			System.out.println("1부터 100까지의 값만 입력하여 주세요.");
			return;}
		if (evg >= 90) {
			qwe = "A";
		} else if (evg >= 80) {
			qwe = "B";
		} else if (evg >= 70) {
			qwe = "C";
		} else if (evg >= 60) {
			qwe = "D";
		} else if (evg >= 50) {
			qwe = "E";
		} else if (evg <= 49) {
			qwe = "F";
		} else {}
		System.out.println("" + name + "님의 총점은" + total + "점이며, 평균은 " + evg + "입니다. 학점은 " + qwe);
		}}
