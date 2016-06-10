/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author :오승준
 * @file :MonthEnd.java
 * @story :
 */
public class MonthEnd2 {
	/**
	 * 개발자님 년, 월을 입력하면 말일이 몇일이 알려주는 프로그램을 만들어 주세요. 단, 윤년 2월은 29일이고, 나머지 해는 28일로
	 * 마감입니다. 1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다.
	 **/
	/**
	 * 윤년의 조건 연도를 4로 나눈 값이 0이라면 윤년일 수 있다. 그러나 해당 연수가 100으로 나눠 떨어지면 평년이다. 2000년은
	 * 4로 나눈값이 0이라서 윤년의 조건은 되는데 다시 이 값이 100으로 나눠 떨어지기 때문에 평년이 되었다. 평년이라해도 다시
	 * 400으로 나눠떨어지는 년도는 윤년이다.
	 **/
	// if((year % 100 != 0) && (year % 4 == 0))
	// else if(year % 400 == 0)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int malil=0;
		System.out.println("년 입력?(예)2016");
		 		int year=2016;
		 		System.out.println("월 입력?(예)2");
		 		int month = 2;
		 		switch (scanner.nextInt()) {
		 		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		 			malil = 31;
		 			break;
		 		case 2:
		 			if(year==1){
		 				malil = 29;
		 			}else{
		 				malil = 28;
		 			}
		 			break;
		 		case 4:case 6:case 9:case 11:
		 			malil = 30;
		 			break;
		 		default:System.out.println("잘못 입력 되었습니다");
		 			return;
		 		}
		 		System.out.println(year+"년"+month+"월"+malil+"일");
		 	}
		 
		 }