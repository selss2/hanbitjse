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
	//String rps = JOptionPane.showInputDialog("1가위 2바위 3보자기");

	public void betPlayerValue(int playerValue) {
		if (1) {
			1 = "가위"; 
		} else {

		}
	}

	@Override
	public void setComputerValue() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int comNum = random.nextInt(3) + 1;
		switch (comNum) {
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
		if (compNum > playNum) {
			
		} else if (compNum == playNum) {

		} else (compNum < playNum)
	
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