/**
 * 
 */
package bank;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 15.
 * @author :오승준
 * @file :BankController.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		int ok = 0;
		Account account = null;

		while (true) {
			switch (JOptionPane.showInputDialog("1.개설 2.입금 3.조회 4.출금, 5.통장내역 0.종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null, "통장을 개설하시겠습니까?");
				if (ok == 0) {

					String name = JOptionPane.showInputDialog("이름");
					account = new Account(name);
				} else {
					continue;
				}
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "4":
				break;
			case "5":
				JOptionPane.showMessageDialog(null,
						Account.BANK_NAME + "\n이름 : " + account.getName() + "\n계좌번호 :" + account.getAccount());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				return;
			}
		}
	}
}
