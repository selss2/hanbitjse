/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15.
 * @author :오승준
 * @file   :BankController.java
 * @story  : 
 */
public class BankController {
public static void main(String[] args) {
	Bank bank = new Bank();
	while (true) {
		switch (JOptionPane.showInputDialog("1.개설 2.입금 3.조회 4.출금, 0.종료")) {
		case "1":
			break;
		case "2":
			String inputMoney = JOptionPane.showInputDialog("입금액?");
			bank.setMoney(Integer.parseInt(inputMoney));
		break;
		case "3":
			JOptionPane.showMessageDialog(null, bank.getMoney());
			break;
		case "4":
			
			break;

		default: JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
			return;
		}
	}
}
}
