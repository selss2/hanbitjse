/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13. 
 * @author :오승준
 * @file   :ForLoopEx.java
 * @story  :1부터 10까지 짝수, 홀수의 급수는? (단 공차는 1)
*/
public class ForLoopEx3 {
	public static void main(String[] args) {
		int i=0,oddSum=0,evenSum=0;
		for (i = 0; i <= 10; i++) {
			if (i%2!=0) {
				oddSum += i;
			}else{
				evenSum += i;
			}
			}
		System.out.printf("홀수의 급수=%d", oddSum);
		System.out.printf("짝수의 급수=%d", evenSum);
	}
}