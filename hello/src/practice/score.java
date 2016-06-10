/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :오승준
 * @file   :score.java
 * @story  : 
 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
 * 이름과 국,영,수 세과목 점수를 입력 받아서
 * [홍길동 : 총점 ***점, 평균***점]
 * 을 출력하는 프로그램을 만들어 주세요.
 * 단) 평균은 소수점 이하는 절삭합니다.
 */
public class score {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int kor=0,eng=0,math=0,total=0,evg=0;
	System.out.println("이름을 입력하세요");
	String name = scanner.next();
	System.out.println("국어 점수를 입력하세요");
	kor = scanner.nextInt();
	System.out.println("영어 점수를 입력하세요");
	eng = scanner.nextInt();
	System.out.println("수학 점수를 입력하세요");
	math = scanner.nextInt();
	total = kor + eng + math;
	evg = total / 3;
	System.out.println(""+name+"님의 국영수 세과목의 합 총점은 "+total+"이며 평균점수는 "+evg+"입니다.");
}
}
