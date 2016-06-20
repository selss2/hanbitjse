/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :Student.java
 * @story :
 */
public class StudentBean {
	private String id, pw, name, regDate, gender, ssn;
	private int age;
	private String reg;

	private String[] ds;

	public StudentBean(String id, String pw, String name, String ssn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		String[] ssnArr = ssn.split("-");
		String[] nowArr = now.split("-");
		int ageResult1 = (Integer.parseInt(ssnArr[0]));
		int genderResult = (Integer.parseInt(ssnArr[1]));
		int ageResult2 = (Integer.parseInt(nowArr[0]));
		int ageResult0 = 0;
		switch (genderResult%2) {
		case 1: case 5: 
			this.gender="남"; 
			ageResult0 = ageResult2 - 1900-(ageResult1/10000);
			this.age = ageResult0;
			break;
		case 3: case 7:
			this.gender="남"; 
			ageResult0 = ageResult2 - 2000-(ageResult1/10000);
			this.age = ageResult0;
			break;
		case 2: case 6:
			this.gender="여";
			ageResult0 = ageResult2 - 1900-(ageResult1/10000);
			this.age = ageResult0;
			break;
		case 4: case 8:
			this.gender="여";
			ageResult0 = ageResult2 - 2000-(ageResult1/10000);
			this.age = ageResult0;
			break;
		default:
			System.out.println("잘못된값이 입력됨");
		}
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
	public void 
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=****, 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + age + ", reg=" + reg + ", ds=" + Arrays.toString(ds) + "]";
	}

}
