/**
 * 
 */
package school;

/**
 * @date   :2016. 6. 20.
 * @author :오승준
 * @file   :StudentServiceImpl.java
 * @story  : 
 */
public class StudentServiceImpl implements StudentService {
StudentBean studentBean;
	
	public void registStudent(String id, String pw, String name, String ssn) {
	studentBean = new StudentBean(id, pw, name, ssn);
	
	}
	public String showStudent() {
		return studentBean.toString();
	}

	public void updateStudent(String pw) {
	studentBean.setPw(pw);
	}
	public void deleteStudent() {
	studentBean = null;
	}
}
