/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 10.
 * @author :오승준
 * @file :TimeCalc.java
 * @story : 초를 가지고 시간 분 초로 환산하기
 */
public class TimeCalc2 {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 5000초로 나오네요.
	 * 그런데 이게 감이 잘 안와서요..
	 * 시간, 분, 초로 나누어서 보게 해주세요.
	 * 예를 들면 50000초가 입력되면
	 * [출력] 25시간 32분 15초 이렇게 보이게 해주세요
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input=0, time=0, minute=0, second=0;
		System.out.println("작업 시간을 입력해주세요 (단위 : 초)");
		input = scanner.nextInt();
		second = input%60; //hour = sec/60/60;
		minute = (input/60)%60; //min = sec/60%60;
		time = input/3600; //sec%60;
		System.out.println(time+"시간"+minute+"분 "+second+"초");
	}

}
