/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :오승준
 * @file   :ForLoopEx6.java
 * @story  :init=0, limit=10,diff=1 인 sequences 
 */
public class ForLoopEx6 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int i = 0;
	for (; i < 11; i++) { // i <= 10
		System.out.printf("%d\t",i);
	}
}
}
