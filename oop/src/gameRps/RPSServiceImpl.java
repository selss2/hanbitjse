/**
 * 
 */
package gameRps;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 20.
 * @author :오승준
 * @file :rpsServiceImpl.java
 * @story :
 */
public class RPSServiceImpl implements RPSService {
	@Override
	public void betPlayerValue(int playerValue) {
	}

	@Override
	public void setComputerValue() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(3) + 1;
		switch (num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

	@Override
	public void whoWin() {
		// TODO Auto-generated method stub
		if (num==) {

		} else {

		}
	}

	@Override
	public String showResult() {
		return null;
	}

	@Override
	public boolean checkValidation(String rps) {
		// TODO Auto-generated method stub
		return false;
	}
}