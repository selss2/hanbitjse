/**
 * 
 */
package school;

/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :Student.java
 * @story :
 */
public class Student {
	String id, name, regDate, gender, ssn;
	int age;

	private String pw;
	public final static String SCHOOL_NAME = "한빛 학원";

	public Student(String id, String name, String ssn) {
		this.name = name;
		this.id = id;
		this.ssn = ssn;
		
		char c = ssn.charAt(7);
		if (c == '0' || c == '9') {
			System.out.println("0과 9는 입력불가");
			return;
		}
		switch (c%2) {
		case 1 : 
			gender = "남성";
			break;
		default:
			gender = "여성";
						break;
		}
	}

	// public void setId(String id) {
	// this.id = id;

	// public void setName(String name) {
	// this.name = name;

	public void setRegDate() {
	}

	// public void setGender() {
	// }

	// public void setSsn(String ssn) {
	// this.ssn = ssn;

	public void setAge() {
	}

	public void setPw(String pw) {
		this.pw = pw;
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
}