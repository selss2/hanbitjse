/**
 * 
 */
package school;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.model.core.ID;

import bank.Account;

/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :SchoolController.java
 * @story :
 */
// 1. 등록 ssn, 아이디, 비번, 이름을 입력 받는다.
// 2. 조회 결과 : 홍길동, id, 성별
public class SchoolController {
	public static void main(String[] args) {
Student student = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("ID");
				String pw = JOptionPane.showInputDialog("PW");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				student = new Student(name, id, ssn);
				break;
			case "2": 	
			JOptionPane.showMessageDialog(null,
					Student.SCHOOL_NAME + "이름 : "
			+student.getName()
			+"\n ID : "+student.getId()
			+"\n 성별 : "+student.getGender());
			break;
			case "0": break;
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				return;
			}
		}
		}
}
