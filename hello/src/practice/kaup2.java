/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @date :2016. 6. 10.
 * @author :오승준
 * @file :kaup2.java
 * @story : 카우푸지수 구하는 프로그램 (강사님 코딩 Ver)
 */
public class kaup2 {
public static void main(String[] args) {
	// ------init 입력부분 ----------------
	Scanner scanner = new Scanner(System.in); //
	String name ="", result="";
			double bmi=0.0, height=0.0, weight=0.0, kaup=0.0;
// -----op----------
			System.out.println("이름?");
name = scanner.next();
System.out.println("키?");
height = scanner.nextDouble();
System.out.println("몸무게?");
weight = scanner.nextDouble();
kaup = weight / (height / 100) / (height / 100);

			if (kaup < 18.5) {
				result = "저체중";
			} else if(kaup >= 18.5 && kaup <= 22.9){
				result = "정상체중";
			} else if(kaup >= 23.0 && kaup <= 24.9){
				result = "위험체중";
			}else if(kaup >= 25.0 && kaup <= 29.9){
					result = "비만1단계";
			}else if(kaup >= 30.0 && kaup <= 39.9){
					result = "비만2단계";
			}else if(kaup >= 40.0){
					result = "비만3단계";
}
//double d = Double.parseDouble(String.format("%.2f", kaup)); 소수점 단위 짜르는 공식 2f에서 숫자가 소수점 자리수
	System.out.println(name +"은 BMI지수는"+Double.parseDouble(String.format("%.2f", kaup))+"이고,"+result+"이다");
			}
}