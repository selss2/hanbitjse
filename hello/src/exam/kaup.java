/**
 * 
 */
package exam;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @date :2016. 6. 10.
 * @author :오승준
 * @file :kaup.java
 * @story : 카우푸 지수 구하는 프로그램
 */
public class kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다. 비만지수를 구하는 것인데요 키와 몸무게를 입력하면 당사자가 비만인지 저체중인지 알려주는 프로그램을
	 * 만들어 주세요. 돈은 입금했습니다 잘은 모르는데 kaup 공식을 쓰면 된다고 하네요. 공식은 나도 몰라요 알아서 하삼...
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double tall = 0.0, weight = 0.0, kaup = 0.0;
		System.out.println("이름을 입력해주세요 : ");
		name = scanner.nextLine();
		System.out.println("키를 입력해주세요 : ");
		tall = scanner.nextDouble();
		System.out.println("몸무게를 입력해주세요 : ");
		weight = scanner.nextDouble();
		kaup = weight / (tall / 100) / (tall / 100);
		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.5 && kaup <= 22.9) {
			result = "정상체중";
		} else if (kaup >= 23.0 && kaup <= 24.9){
			result = "위험체중";
		}else if (kaup >= 25.0 && kaup <= 29.9){
			result = "비만1단계";
		}else if (kaup >= 30.0 && kaup <= 39.9){
			result = "비만2단계";
		}else if (kaup >= 40.0){
			result = "비만3단계";
	}
		System.out.println(name + "는"+ result +"입니다");
	}
}