/**
 * 
 */
package branch;

import java.util.Random;
import java.util.Scanner;

/**
 * @date :2016. 6. 10.
 * @author :오승준
 * @file :OddEven.java
 * @story :
 */
public class OddEven {
	/**
	 * 개발자님, 홀짝 게임하나 만들어 주세요. 사용자가 홀인지 짝인지 맞추면 WIN 틀리면 LOSE 가 출력되면 됩니다.
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String result = "LOSE";
		int num = random.nextInt(10) + 1;
		int deal = 0;
		System.out.println("===개발자만 보는 화면===");
		System.out.println("랜덤수는 " + num);
		System.out.println("돈을 거시는데 짝이라고 생각하면 0을 " + "홀이라고 생각하면 1을 입력하시오");
		deal = scanner.nextInt();
		if (deal ==  num %2) {
			result = "WIN";
	}
		System.out.println(result);
}
}