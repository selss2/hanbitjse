/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :Student.java
 * @story :
 */
public class Student {
	private String id, pw, name, regDate, gender, ssn;
	private int age;
	private String reg;

	public final static String SCHOOL_NAME = "한빛 학원";
	private String[] ds;

	public Student(String id, String pw, String name, String ssn) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd")
				.format(new Date(System.currentTimeMillis()));
		this.Reg(now);
		setDs(now.split("-"));
		String[] arr = ssn.split("-");
		char c = ssn.charAt(7);
		if (c == '0' || c == '9') {
			JOptionPane.showMessageDialog(null, "0과 9는 입력불가");
			return;
		}
		switch (c%2) {
		case 1 : 
			this.gender = "남성";
			break;
		default:
			this.gender = "여성";
						break;
		}
		int dage = Integer.parseInt(arr[0]);
		age = 2016 - (dage/100000+1900);
		}
	private void Reg(String now) {
		
	}
	public String getName() {
		return this.name;
	}
	public String getRegDate() {
		return this.regDate;
	}
	public String getGender() {
		return this.gender;
	}
	public String getSsn() {
		return this.ssn;
	}
	public int getAge() {
		return this.age;
	}
	public String getPw() {
		return this.pw;
	}
	public String getId() {
		return this.id;
	}
	public String getReg() {
		return reg;
	}
	public void setDs(String[] ds) {
		this.ds = ds;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=****, 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + age + ", reg=" + reg + ", ds=" + Arrays.toString(ds) + "]";
	}

}
