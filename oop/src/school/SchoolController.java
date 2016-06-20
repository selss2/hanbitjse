/**
 * 
 */
package school;

import javax.swing.JOptionPane;

import bank.AccountBean;

/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :SchoolController.java
 * @story :
 */
// 1. 등록 ssn, 아이디, 비번, 이름을 입력 받는다.
// 2. 조회 결과 : 홍길동, id, 성별
public class SchoolController {
	public static void main(String[] args) { // String[] params
		StudentBean student = null;
		StudentServiceImpl studentService = new StudentServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
				stu
				student = JOptionPane.showInputDialog(null, "ID, PW, 이름, 주민번호");
				String id = JOptionPane.showInputDialog("ID");
				String pw = JOptionPane.showInputDialog("PW");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호 ex)000101-1");
				student = new StudentBean(id, pw, name, ssn);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, student.toString());
				break;
			case "0":
				break;
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				break;
			}
		}
	}
}
