/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :오승준
 * @file   :ForLoopEx6.java
 * @story  :init=0, limit=10, diff=2 인 reverse sequences 
 */
public class ForLoopEx7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int i = 10;
	for (; i > -1; i-=2) {
		System.out.printf("%d\t",i);
	}
}
}
