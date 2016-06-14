package loop;
/**
 * @date :2016. 6. 13.
 * @author :오승준
 * @file :ForLoopEx.java
 * @story : 1부터 10까지 홀수의 급수
 */
public class ForLoopEx {
	public static void main(String[] args) {
		int i = 0, sum=0;
		for (i=1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		}


}
