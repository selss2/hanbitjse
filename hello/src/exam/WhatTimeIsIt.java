/**
 * 
 */
package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/**
 * @date :2016. 6. 17.
 * @author :오승준
 * @file :WhatTimeIsIt.java
 * @story :
 */
public class WhatTimeIsIt {
public static void main(String[] args) {/*
long time = System.currentTimeMillis();
System.out.println(time);
Date date = new Date(time);
System.out.println(date);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
System.out.printf(sdf.format(date));
*/
/*System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
System.out.println(new SimpleDateFormat("yyyy년-MM월-dd일 HH시:mm분:ss초").format(new Date(System.currentTimeMillis())));
*/
	
	String now = new SimpleDateFormat("yyyy-MM-dd")
			.format(new Date(System.currentTimeMillis()));
	System.out.println(now);
	String[] arr = now.split("-");
for (String string : arr){
	System.out.println(string);
}
	/*
	String year = arr[0];
	System.out.println(year);
	*/
	
	/*String[] arr = new String[3];*/
	
	/*
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);*/
	}
	
}
